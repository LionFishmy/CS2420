package assign04;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargesNumberSolverTest {
	private Integer[] smallarr;
	private Integer[] bigarr;
	private ArrayList<Integer[]> list;
	Comparator<Integer> naturalOrderInt;

	@BeforeEach
	void setup() throws FileNotFoundException {
		smallarr = new Integer[] {1, 45, 9};
		naturalOrderInt = Comparator.naturalOrder();
		bigarr = new Integer[1000];
		
		
	}

	@Test
	void TestInsertionSortSmall() {
		LargestNumberSolver.insertionSort(smallarr, naturalOrderInt);
	}
	@Test
	void TestfindLargestSmall() {
		BigInteger big = LargestNumberSolver.findLargestNumber(smallarr);
		System.out.print(big);
	}
	@Test
	void TestReadFile() throws FileNotFoundException {
		list= (ArrayList<Integer[]>) LargestNumberSolver.readFile("integers.txt");
		assertEquals(Arrays.toString(list.get(list.size()-1)),Arrays.toString(new Integer[] {85, 35, 34, 52, 14, 92, 9, 79, 82, 83}));
	}

}



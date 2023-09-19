package assign04;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LargestNumberSolver {

	public static <T> void insertionSort(T[] arr, Comparator<? super T> cmp) {
		T tem = arr[1];
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			tem = arr[i];
			j = i - 1;
			while (j >= 0 && cmp.compare(arr[j], tem) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = tem;
		}
	}

	public static BigInteger findLargestNumber(Integer[] arr) {
		BigInteger big = BigInteger.ZERO;

		return big;

	}

	private static <T>int sortAsLargestNumber(T lhs, T rhs) {
		String s1 = lhs.toString();
		String s2 = rhs.toString();

		String case1 = s1 + s2;
		String case2 = s2 + s1;
		

		int c1 = Integer.parseInt(case1);
		int c2 = Integer.parseInt(case2);
		
		
		
		return c1-c2;
	
	}

	public static int findLargestInt(Integer[] arr) throws OutOfRangeException {
		return 0;

	}

	public static long findLargestLong(Integer[] arr) throws OutOfRangeException {
		return 0;

	}

	public static BigInteger sum(List<Integer[]> list) {
		return null;

	}

	public static Integer[] findKthLargest(List<Integer[]> list, int k) throws IllegalArgumentException {
		return null;

	}

	public static List<Integer[]> readFile(String filename) throws FileNotFoundException {
		List<Integer[]> list = new ArrayList<Integer[]>();
		Scanner scan = new Scanner(new File(filename));
		Integer[] array = new Integer[10];
		while (scan.hasNextLine()) {
			String thisLine = scan.nextLine();
			try (Scanner line = new Scanner(thisLine)) {
				int i = 0;
				while (line.hasNextInt()) {// increase the size of array
					if (array.length >= i) {
						Integer[] copy = new Integer[i + 1];
						System.arraycopy(array, 0, copy, 0, i);
						array = copy;
					}
					array[i] = line.nextInt();
					i++;
				}
			}
			list.add(array);
		}
		return list;
	}

}
//class SortAsLargestNumber<T> implements Comparator<? super T>{
//	
//}

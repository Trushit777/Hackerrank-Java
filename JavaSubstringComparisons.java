package com.company;

import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/java-string-compare/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class JavaSubstringComparisons {

	/**
	 * @param s
	 * @param k
	 *
	 * @return
	 */
	public static String getSmallestAndLargest(String s, int k) {
		java.util.TreeSet<String> strings = new java.util.TreeSet<>();
		for(int i=0;i<s.length()-k+1;i++){
			strings.add(s.substring(i,i+k));
		}
		return strings.first() + "\n" + strings.last();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}

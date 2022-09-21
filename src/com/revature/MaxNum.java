/***
 * Problem Statement
Write a program that accepts sets of three numbers and prints the second-maximum number among the three.

Input

	
First line contains the number of triples, N.
	
The next N lines which follow each have three space separated integers.

Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.

Constraints


	
1 ≤ N ≤ 6
	
1 ≤ every integer ≤ 10000
	
The three integers in a single triplet are all distinct. That is, no two of them are equal.

Sample Input
3
1 2 3
10 15 5
100 999 500
Sample Output
2
10
500
 */

package com.revature;

import java.util.Arrays;

public class MaxNum {
	public static void main(String[] args) {

		int[][] threeNum = { {12,35,38}, {8,4,10}, {67,34,79} };
		
		int[] max = secondMaxNum(threeNum);
		
		for(int secondMax: max) {
			System.out.println(secondMax);
		}
		
	}
		
	static int[] secondMaxNum(int[][] threeNum) {
		int[] arr = new int[threeNum.length];
		
		for(int i = 0; i < threeNum.length; i++) {
			Arrays.sort(threeNum[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = threeNum[i][1];
		}
		return arr;
	}


}

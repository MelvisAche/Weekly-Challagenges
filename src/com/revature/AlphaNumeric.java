/***
 * Problem statement
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

Input


	
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
	
Each test case is described with a single line containing a string S, the alphanumeric string.

Output


	
For each test case, output a single line containing the sum of all the digit characters in that string.

Constraints


	
1 ≤ T ≤ 1000
	
1 ≤ |S| ≤ 1000, where |S| is the length of the string S.

Example
Input:
1
ab1231da
Output:
7

Explanation
The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
 */

package com.revature;

public class AlphaNumeric {
	public static void main(String[] args) {

		int T = 2;
		String[] arr = new String[T];

		arr[0] = "ab1231da";
		arr[1] = "ab1231da";

		System.out.print(digitSum(T, arr));

		}

		static int digitSum(int T, String[] string) {
			int sum = 0;
			
			if(T < 1) {
				return sum;
			} 
			
			int count = 0;
			
			while (count <= T - 1) {
				
				for(int i = 0; i <= string[count].length() - 1; i++) {
					char temp = string[count].charAt(i);
					
					if(Character.isDigit(temp))
					sum += Integer.parseInt(String.valueOf(temp));		
				}
				count++;
			}
			return sum;
		}

}

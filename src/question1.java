
public class question1 {
/*PART 1: Coding tasks 

Create a 2D array of integer values. Print the sum of all numbers.
Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
Write a program to swap 2 numbers without a temporary variable?
Write a java program to check whether a given number is prime or not?
Write a Java Program to print the first 10 numbers of Fibonacci series.
Maximum and minimum number in the array?
Write a java program to find the second largest number in the array?*/
	public static void main(String[] args) {
		int sum=0;
	int[][] arr= {{2,3,5,6,7,9},{5,2,3,4,1,6}};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			sum+=arr[i][j];
		}
		
	}
	System.out.println(sum);
	}

}


public class question3 {
/*Create a 2D array of integers.
 *  Develop a program which will calculate the sum of  even and odd numbers for that array.*/
	public static void main(String[] args) {
		int sumodd=0;
		int sumeven=0;
	int[][] arr= {{2,3,4,5,9},{3,7,11,44,21}};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(arr[i][j]%2==0) {
				sumeven+=arr[i][j];
			}
			else {
				sumodd+=arr[i][j];
			}
			
		}
	}
System.out.println("even numbers sum is "+sumeven);
System.out.println("odd numbers sum is "+sumodd);
	}

}


public class question2 {
/*
Create a 2D array or integer type where you will store odd and even numbers. 
Develop a program which will identify/print the even numbers only.*/
	public static void main(String[] args) {
	int[][] arr= {{2,3,5,4,9},{12,14,15,19}};
	
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		if(arr[i][j]%2==0) {
			System.out.println("even numbers "+arr[i][j]);
		}
		else {
			System.out.println("odd numbers "+arr[i][j]);
		}
	}
}
	}

}


public class question8 {
/*Write a java program to find the second largest number in the array?
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {4,5,7,8,9,88,56};
int largest=arr[0];
int second=arr[0];
for (int i = 0; i < arr.length; i++) {
	if(largest<arr[i]) {
		largest=arr[i];
		
	}
	
}
System.out.println("largest is"+largest);
for (int i = 0; i < arr.length; i++) {
	if(arr[i]<largest)
		second=arr[i];
}
System.out.println("second largest is "+second);
	}

}

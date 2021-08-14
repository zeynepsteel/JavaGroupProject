
public class question7 {
	/*Maximum and minimum number in the array*/
public static void main(String[] args) {
	int [] arr= {55,4,444,66,89,34,9999};
int max=arr[0];
int min=arr[0];
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]>=max) {
			max=arr[i];
		}else if(min>=arr[i])
			min=arr[i];
	}
	System.out.println("max="+max);
	System.out.println("min="+min);
}
}

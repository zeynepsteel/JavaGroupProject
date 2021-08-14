import java.util.Scanner;

public class question5 {
/*Write a java program to check whether a given number is prime or not?*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
		int number=scan.nextInt();
		boolean isPrime=true;
		for(int i=2; i<number;i++) {
		if(number%i==0) {
			isPrime=false;
			break;
		
		}
		}
	if(isPrime) {
		System.out.println("it is prime");

	}else {
		System.out.println("it is not prime");
	}

}}

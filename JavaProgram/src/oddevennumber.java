import java.util.Scanner;

public class oddevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter any number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n%2==0) {
			System.out.print("Even Number");
		}
		else {
			System.out.print("Odd Number");
		}

	}

}

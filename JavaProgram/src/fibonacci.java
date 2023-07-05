
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second =1;
		int n=10;
		
		for(int i=1;i<=10;i++) 
		{
			System.out.print(first+ " ");
			int thrid=first+second;
			first=second;
			second=thrid;
			
		}
	}

}

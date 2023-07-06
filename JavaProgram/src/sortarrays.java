
public class sortarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marksArray=new int[]{44,23,78,89};
		int temp;
		for(int i=0;i<marksArray.length;i++) {
			for (int j=i;j<marksArray.length;j++) {
				if(marksArray[i] < marksArray[j]) {
					temp=marksArray[i];
					marksArray[i]=marksArray[j];
					marksArray[j]=temp;
				}
				
			}
		}
		for(int a : marksArray) {
			System.out.print(a);
		}
	}

}

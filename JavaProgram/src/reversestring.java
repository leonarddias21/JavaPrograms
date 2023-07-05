
 class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Leonard";
		int length=name.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("The reverse String is "+rev);

	}

}

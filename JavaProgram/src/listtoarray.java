import java.util.Arrays;
import java.util.List;

public class listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> allGrades=Arrays.asList(5,3,4,5,6);
		int[] grades= new int[allGrades.size()];
		
		for(int i=0;i<allGrades.size();i++)
		{
			grades[i]=allGrades.get(i);
		}
		System.out.print(Arrays.toString(grades));
}
}
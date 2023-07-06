import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateintegers {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int [] a= {5,4,4,3,9,3};
				Set<Integer> set= new HashSet<Integer>();
				for(int i =0;i<a.length;i++) {
					set.add(a[i]);
				}
				Integer[] b=set.toArray(new Integer[set.size()]);
				System.out.println(Arrays.toString(b));

	}

}

package j0902;
import java.util.ArrayList;
/**
 * ArrayList
 * */
public class Ex2401 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i=0;i < 100 ; i++)
		{
			A.add(i);
		}
		for(int i=0;i < 100 ; i++)
		{
			int e = A.get(i);
			if(e%13 == 0)
			{
				B.add(e);
			}
		}
		System.out.println(B);

	}

}

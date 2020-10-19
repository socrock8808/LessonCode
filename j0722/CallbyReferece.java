package j0722;
/**
 * Call by reference
 * */
public class CallbyReferece {

	public static void main(String[] args) {
		int[] A = {54,6,87,4,56};
		int[] C = A; //將C指向A的記憶體位置
		int[] F = {54,6,87,4,56}; //創建一個新的記憶體位置
		if(A == C)
		{
			System.out.println("A == C");
		}
		else
		{
			System.out.println("A != C");
		}
		if(A == F)
		{
			System.out.println("A == F");
		}
		else
		{
			System.out.println("A != F");
		}

	}

}

package j0812;
/**
 * 嘗試例外
 * */
public class P2001 {

	public static void main(String[] args) {
		/* NullPointerException */
		try 
		{
			String nu = null;
			System.out.println(nu.length());
		} 
		catch (NullPointerException e) 
		{
			
			System.out.println("NullPointerException");
		}
		
		/* NumberFormatException */
		try 
		{
			String num = "Taiwan";
			int nn = Integer.parseInt(num);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("NumberFormatException");
		}
		
		/* StringIndexOutOfBoundsException */
		try 
		{
			String str = "Taiwan";
			char ch = str.charAt(10);
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
	}

}

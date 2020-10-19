package j0709;
/**
 * leetcode程式測試
 * 輸入任意數n，回傳能組成最大三角形的邊長(num)
 * */
public class LeetcodeTest {

	public static void main(String[] args) {
		int n =8;//輸入的總個數
		int count=n,num=0,j=1;
        System.out.println("n = "+n);
        System.out.println("The coins can form the following rows:");
        
        do//從第一行開始列印，第一行一個，第二行兩個，以此類推
        {
            for(int i=1;i<=j;i++)
            {
                System.out.print("* ");//測試列印
                count--;//總數目減少
                if(count==0)//如數目已用完，則跳出
                {
                    break;
                }
            }
            System.out.println("");//跳到下一列做輸出
            if(count !=0)//如數目還沒完，設定下一行要列印的參數
            {
            	num++;//回傳值增加
            	j++;//該行總個數增加
            }
        }while(count > 0);
        System.out.print(num);//回傳值
    }
}


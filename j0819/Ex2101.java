package j0819;
/**
 * Thread練習
 * 龜兔賽跑，跑100m
 * */
public class Ex2101 {
	
	public static void main(String[] args) {
		T1 t1 = new T1("Turtle");
		R1 r1 = new R1("rabbit");
		t1.start();
		r1.start();
	}

}

class T1 extends Thread{
	//烏龜 每次走3m
	final int goal=100;
	String name;
	int tmp=0;
	T1(String name){
		this.name = name;
	}
	public void run(){
		System.out.println("\t\t"+this.name + "開始起跑~");
		do
		{
			try
			{
				sleep(300);
			}catch(InterruptedException e){}
			tmp += 3;
			System.out.println("\t\t"+this.name + "已經跑了"+ this.tmp +"m..");
		}while(tmp < goal);
		System.out.println("\t\t"+this.name + "到達終點!!!");
	}
}

class R1 extends Thread{
	//兔  每次走5m 走兩次休息0.5秒
	final int goal=100;
	String name;
	int tmp=0;
	int rest=0;
	R1(String name){
		this.name = name;
	}
	public void run(){
		System.out.println(this.name + "開始起跑~");
		do
		{
			try
			{
				sleep(300);
			}catch(InterruptedException e){}
			rest++;
			tmp += 5;
			System.out.println(this.name + "已經跑了"+ this.tmp +"m..");
			if(rest==2){
				try
				{
					sleep(500);
					rest=0;
				}catch(InterruptedException e){}
			}
		}while(tmp < goal);
		System.out.println(this.name + "到達終點!!!");
	}
}
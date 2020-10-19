package j0821;
/**
 * 同步練習
 * 丟球與接球
 * */
public class P21002 {

	public static void main(String[] args) {
		Ball ball = new Ball();
		new ThrowBall(ball).start();
		new CatchBall(ball).start();
	}

}
/*丟球類別*/
class ThrowBall extends Thread{
	private Ball ball;
	public ThrowBall(Ball ball){
		this.ball = ball;
	}
	public void run(){
		for(int i=0;i<5;i++)
		{
			ball.throwBall("Master");
		}
	}
}
/*接球類別*/
class CatchBall extends Thread{
	private Ball ball;
	public CatchBall(Ball ball){
		this.ball = ball;
	}
	public void run(){
		for(int i=0;i<5;i++)
		{
			ball.catchBall("Doggy");;
		}
	}
}
class Ball{
	private boolean isThrow;
	/*球還沒丟*/
	Ball(){
		isThrow = false;
	}
	/*丟球同步方法*/
	public synchronized  void throwBall(String name){
		while(isThrow)
		{
			/*如果球已丟出，等待球回來*/
			try
			{
				wait();
			}
			catch(InterruptedException e){}
		}
		System.out.println( name + "Throw the ball");
		/*球已丟出*/
		isThrow = true;
		/*喚醒*/
		notify();
		/*休息1秒*/
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e){}
	}
	/*接球同步方法*/
	public synchronized  void catchBall(String name){
		while(!isThrow)
		{
			/*如果球還沒丟，等待球來*/
			try
			{
				wait();
			}
			catch(InterruptedException e){}
		}
		System.out.println( name + "catch the ball");
		/*球已接到*/
		isThrow = false;
		/*喚醒*/
		notify();
		/*休息1秒*/
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e){}
	}
}


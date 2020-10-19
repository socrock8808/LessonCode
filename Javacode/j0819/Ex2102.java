package j0819;
/**
 * Thread練習
 * 煮飯時間15min
 * 小明要求媽媽煮飯
 * 煮飯期間不可打擾媽媽
 * */
public class Ex2102 {

	public static void main(String[] args) {
		Thread mom = new Thread(){
			public void run(){
				for (int i = 1; i < 6; i++) {
					try {
						System.out.println("Mom is cooking" +i);
						sleep(400);
					} catch (InterruptedException e) {} 
				}
			}
		};
		Thread ming = new Thread(){
			public void run(){
				System.out.println("Ming is eating");
			}
		};
		System.out.println("Ming ask Mon cooking");
		mom.start();
		try{
			mom.join();
		}catch(InterruptedException e){}
		ming.start();

	}

}
package XiaoDai;

public class JavaThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1 = new MyThread1();
		Runnable t2 = new MyThread2();
		
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		
		t3.start();
		t4.start();
	}

}

class MyThread1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 50; ++i) {
			System.out.println("dajiakang:" + i);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 50; ++i) {
			System.out.println("xiaodai:" + i);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
}
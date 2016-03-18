package thread;

import java.util.concurrent.CountDownLatch;

public class TestHarness {

	public long timeTasks(int nThreads , final Runnable task)
	throws InterruptedException{
		//开始门
		final CountDownLatch startGate = new CountDownLatch(1);
		//结束门
		final CountDownLatch endGate = new CountDownLatch(nThreads);
		for(int i = 0; i < nThreads; i++){
			Thread t = new Thread(){
				public void run(){
					try{
						startGate.await();
						try{
							task.run();
						}finally{
							endGate.countDown();
						}
					}catch (InterruptedException ignored){}
				}
			};
			t.start();
		}
		long start = System.nanoTime();
		//当所有子线程都都就绪，开启
		startGate.countDown();
		//主线程等待多有线程都结束，主线程在开始执行
		endGate.await();
		long end = System.nanoTime();
		
		return end - start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

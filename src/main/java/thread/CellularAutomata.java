package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import thread.support.Board;


public class CellularAutomata {
	
	private final Board mainBoard;
	private final CyclicBarrier barrier;
	private final Worker[] workers;

	public CellularAutomata(Board board){
		this.mainBoard = board;
		int count = Runtime.getRuntime().availableProcessors();
		this.barrier = new CyclicBarrier(count, new Runable(){
			public void run(){
				mainBoard.commitNewValues();
			}
		});
		this.workers = new Worker[count];
		for(int i=0;i<count;i++){
			workers[i] = new Worker(mainBoard.getSubBoard(count,i));
		}
	}
	
	private class Worker implements Runnable{
		private final Board board;
		public Worker(Board board){
			this.board = board;
		}
		public void run(){
			while(!board.hasConverged()){
				for(int x = 0; x<board.getMaxX();x++){
					for(int y=0;y<board.getMaxY();y++){
						board.setNewValue(x,y,computeValue(x,y));
					}
				}
				try{
					barrier.await();
				}catch(InterruptedException e){
					return;
				}catch(BrokenBarrierException e){
					return;
				}
			}
		}
		
	}
	public void start(){
		for(int i=0;i<workers.length;i++){
			new Thread(workers[i]).start();
		}
		mainBoard.waitForConvergence();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

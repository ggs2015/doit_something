package thread;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class BoundedHashSet<T> {

	private final Set<T> set;
	private final Semaphore sem;
	
	public BoundedHashSet(int bound){
		this.set = Collections.synchronizedSet(new HashSet<T>());
		sem = new Semaphore(bound);
	}
	
	public boolean add(T o) throws InterruptedException{
		//获得许可或阻塞（是阻塞而不是失败）
		sem.acquire();
		boolean wasAdded = false;
		try{
			wasAdded = set.add(o);
			return wasAdded;
		}finally{
			if(!wasAdded){
				//释放一个许可
				sem.release();
			}
		}
	}
	
	public boolean remove(Object o){
		boolean wasRemove = set.remove(o);
		if(wasRemove){
			//释放一个许可
			sem.release();
		}
		return wasRemove;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

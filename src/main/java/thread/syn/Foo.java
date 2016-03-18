package thread.syn;

public class Foo extends Thread{
	private int val;
	private static Object lock=new Object();
	public Foo(int v){
		this.val = v;
	}
	/**
	 * 对对象加锁
	public synchronized void printVal(int v){ 
		int i = 0;
		while(true){ 
			i++;
			System.out.print(v);
			if(i>20000){
				break;
				}
		} 
	}
	*/
	
	
	/**
	//对类加锁
	public void printVal(int v){ 
		int i = 0;
		synchronized(Foo.class){while(true){ 
			i++;
			System.out.print(v);
			if(i>20000){
				break;
				}
			} 
		}
	}
	*/
	public void printVal(int v){ 
		int i = 0;
		synchronized(lock){while(true){ 
			i++;
			System.out.print(v);
			if(i>20000){
				break;
				}
			} 
		}
	}
	
	public void run()
	{
		printVal(val); 
	} 
}

package thread.syn;

public class SyncTest {
	//同步加锁的是对象，而不是代码。
	public static void main(String[] args) {
		Foo f1 = new Foo(1); 
		f1.start(); 
		Foo f2 = new Foo(3);
		f2.start();
	}

}

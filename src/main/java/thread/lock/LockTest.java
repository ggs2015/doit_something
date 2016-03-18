package thread.lock;

public class LockTest {

	public boolean transferMoney(Account fromAcct,Account toAcct,
			){
		
		
		while(true){
			if(fromAcct.lock.tryLock()){
				try{
					if(toAcct.lock.tryLock()){
						try{
							if(fromAcct.getBlance().compareTo(amount) < 0){
								throw new InsufficientFundsException();
							}else{
								fromAcct.debit(amount);
								toAcct.credit(amount);
								return true;
							}
						} finally {
							toAcct.lock.unlock();
						}
					}
					
				} finally{
					fromAcct.lock.unlock();
				}
			}
			//超时
			if(System.nanoTime() < stopTime){
				return false;
			}else{
				//引入随机时间，避免活锁
				NANOSECONDS.sleep(delay+randomTime);
			}
		}
	}
}

1.账号A,B
//下面在while循环中
2.A.tryLock
3.B.tryLock
4.逻辑判断并执行
5.finally B.unlock
6.finally A.unlock
7.超时自动返回
8.shleep随机秒数


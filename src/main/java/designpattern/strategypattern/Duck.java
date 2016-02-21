package designpattern.strategypattern;

import designpattern.strategypattern.behavior.fly.FlyBehavior;
import designpattern.strategypattern.behavior.quack.QuackBehavior;

public abstract class Duck {

	//多用组合
	//面向接口编程
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	
	public void swim(){
		System.out.println("duck swim");
	}
	
	public void performQuack(){
		//将perform行为委托给，具体实现的对象
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public abstract void display();

	//----------动态设置属性
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}

package designpattern.strategypattern.duckImpl;

import designpattern.strategypattern.Duck;
import designpattern.strategypattern.behavior.fly.impl.FlyWithWings;
import designpattern.strategypattern.behavior.quack.impl.Quack;

public class MallardDuck extends Duck {

	//构造方法
	public MallardDuck(){
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("i am MallardDuck");
	}

}

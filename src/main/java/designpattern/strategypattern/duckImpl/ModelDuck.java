package designpattern.strategypattern.duckImpl;

import designpattern.strategypattern.Duck;
import designpattern.strategypattern.behavior.fly.impl.FlyNoway;
import designpattern.strategypattern.behavior.quack.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck(){
		super.setFlyBehavior(new FlyNoway());
		super.setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("i am a model duck");
	}

}

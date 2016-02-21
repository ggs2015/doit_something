package designpattern.strategypattern;

import designpattern.strategypattern.behavior.fly.impl.FlyRocketPowered;
import designpattern.strategypattern.duckImpl.MallardDuck;
import designpattern.strategypattern.duckImpl.ModelDuck;

public class TestDuck {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		//运行时改变行为
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}

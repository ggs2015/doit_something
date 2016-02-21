package designpattern.strategypattern.behavior.fly.impl;

import designpattern.strategypattern.behavior.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	public void fly() {
		System.out.println("i'm flying with a rocket!");
	}

}

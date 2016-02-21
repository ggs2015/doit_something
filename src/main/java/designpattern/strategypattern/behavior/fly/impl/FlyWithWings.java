package designpattern.strategypattern.behavior.fly.impl;

import designpattern.strategypattern.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("fly with wings");
	}

}

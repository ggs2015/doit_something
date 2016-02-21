package designpattern.strategypattern.behavior.quack.impl;

import designpattern.strategypattern.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("zhi zhi");
	}

}

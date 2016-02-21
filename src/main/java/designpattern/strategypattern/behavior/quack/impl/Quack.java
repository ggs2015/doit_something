package designpattern.strategypattern.behavior.quack.impl;

import designpattern.strategypattern.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("gua gua");
	}

}

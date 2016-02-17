package designpattern.factorypattern.creator;

import designpattern.factorypattern.product.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.perpare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}

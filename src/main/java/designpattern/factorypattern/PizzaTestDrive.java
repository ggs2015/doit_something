package designpattern.factorypattern;

import designpattern.factorypattern.creator.ChicagoPizzaStore;
import designpattern.factorypattern.creator.NYPizzaStore;
import designpattern.factorypattern.creator.PizzaStore;
import designpattern.factorypattern.product.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {

		PizzaStore nyPizzaStore =  new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("----------------");
		pizza = chicagoStore.orderPizza("cheese");
	}

}

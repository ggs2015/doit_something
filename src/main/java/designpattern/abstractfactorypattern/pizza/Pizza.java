package designpattern.abstractfactorypattern.pizza;

import designpattern.abstractfactorypattern.ingredient.productinterface.Cheese;
import designpattern.abstractfactorypattern.ingredient.productinterface.Clams;
import designpattern.abstractfactorypattern.ingredient.productinterface.Dough;
import designpattern.abstractfactorypattern.ingredient.productinterface.Pepperoni;
import designpattern.abstractfactorypattern.ingredient.productinterface.Sauce;
import designpattern.abstractfactorypattern.ingredient.productinterface.Veggies;

public abstract class Pizza {

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println(" Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}

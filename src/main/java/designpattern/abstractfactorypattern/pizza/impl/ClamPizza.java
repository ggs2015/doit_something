package designpattern.abstractfactorypattern.pizza.impl;

import designpattern.abstractfactorypattern.ingredient.PizzaIngredientFactory;
import designpattern.abstractfactorypattern.pizza.Pizza;

public class ClamPizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing" + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClams();
	}

}

package designpattern.abstractfactorypattern.pizza.impl;

import designpattern.abstractfactorypattern.ingredient.PizzaIngredientFactory;
import designpattern.abstractfactorypattern.pizza.Pizza;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}

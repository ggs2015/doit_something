package designpattern.abstractfactorypattern.pizza.impl;

import designpattern.abstractfactorypattern.ingredient.PizzaIngredientFactory;
import designpattern.abstractfactorypattern.pizza.Pizza;

public class VeggiePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub

	}

}

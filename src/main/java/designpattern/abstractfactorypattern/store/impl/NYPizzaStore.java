package designpattern.abstractfactorypattern.store.impl;

import designpattern.abstractfactorypattern.ingredient.PizzaIngredientFactory;
import designpattern.abstractfactorypattern.ingredient.productfactory.NYPizzaIngredientFactory;
import designpattern.abstractfactorypattern.pizza.Pizza;
import designpattern.abstractfactorypattern.pizza.impl.CheesePizza;
import designpattern.abstractfactorypattern.pizza.impl.ClamPizza;
import designpattern.abstractfactorypattern.pizza.impl.PeppperoniPizza;
import designpattern.abstractfactorypattern.pizza.impl.VeggiePizza;
import designpattern.abstractfactorypattern.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if(type.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style veggie Pizza");
		}else if(type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style clam Pizza");
		}else if(type.equals("peppperoni")){
			pizza = new PeppperoniPizza(ingredientFactory);
			pizza.setName("New York Style peppperoni Pizza");
		}
		return pizza;
	}

}

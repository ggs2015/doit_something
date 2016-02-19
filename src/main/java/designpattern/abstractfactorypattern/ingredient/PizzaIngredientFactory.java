package designpattern.abstractfactorypattern.ingredient;

import designpattern.abstractfactorypattern.ingredient.productinterface.Cheese;
import designpattern.abstractfactorypattern.ingredient.productinterface.Clams;
import designpattern.abstractfactorypattern.ingredient.productinterface.Dough;
import designpattern.abstractfactorypattern.ingredient.productinterface.Pepperoni;
import designpattern.abstractfactorypattern.ingredient.productinterface.Sauce;
import designpattern.abstractfactorypattern.ingredient.productinterface.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}

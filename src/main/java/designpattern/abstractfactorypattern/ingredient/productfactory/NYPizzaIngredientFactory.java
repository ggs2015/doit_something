package designpattern.abstractfactorypattern.ingredient.productfactory;

import designpattern.abstractfactorypattern.ingredient.PizzaIngredientFactory;
import designpattern.abstractfactorypattern.ingredient.productinterface.Cheese;
import designpattern.abstractfactorypattern.ingredient.productinterface.Clams;
import designpattern.abstractfactorypattern.ingredient.productinterface.Dough;
import designpattern.abstractfactorypattern.ingredient.productinterface.Pepperoni;
import designpattern.abstractfactorypattern.ingredient.productinterface.Sauce;
import designpattern.abstractfactorypattern.ingredient.productinterface.Veggies;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.FreshClams;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.Garlic;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.MarinaraSauce;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.Mushroom;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.Onion;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.RedPepper;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.ReggianoCheese;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.SlicedPepperoni;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.newyork.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new Garlic(),
				new Onion(),
				new Mushroom(),
				new RedPepper()
		};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClams() {
		return new FreshClams();
	}

}

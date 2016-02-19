package designpattern.abstractfactorypattern.ingredient.productfactory;

import designpattern.abstractfactorypattern.ingredient.PizzaIngredientFactory;
import designpattern.abstractfactorypattern.ingredient.productinterface.Cheese;
import designpattern.abstractfactorypattern.ingredient.productinterface.Clams;
import designpattern.abstractfactorypattern.ingredient.productinterface.Dough;
import designpattern.abstractfactorypattern.ingredient.productinterface.Pepperoni;
import designpattern.abstractfactorypattern.ingredient.productinterface.Sauce;
import designpattern.abstractfactorypattern.ingredient.productinterface.Veggies;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.BlackOlives;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.EggPlant;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.FrozenClams;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.Mozzarella;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.PluTomatoSauce;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.SlicePepperoni;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.Spinach;
import designpattern.abstractfactorypattern.ingredient.productinterface.productinterfaceimpl.chicago.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PluTomatoSauce();
	}

	public Cheese createCheese() {
		return new Mozzarella();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {
				new BlackOlives(),
				new Spinach(),
				new EggPlant()
		};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicePepperoni();
	}

	public Clams createClams() {
		return new FrozenClams();
	}

}

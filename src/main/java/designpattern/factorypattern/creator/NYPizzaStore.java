package designpattern.factorypattern.creator;

import designpattern.factorypattern.product.NYStyleCheesePizza;
import designpattern.factorypattern.product.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new NYStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}else{
			return null;
		}
		
	}

}

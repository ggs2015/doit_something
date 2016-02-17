package designpattern.factorypattern.creator;

import designpattern.factorypattern.product.ChicagoStyleCheesePizza;
import designpattern.factorypattern.product.ChicagoStyleClamPizza;
import designpattern.factorypattern.product.ChicagoStyleVeggiePizza;
import designpattern.factorypattern.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new ChicagoStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new ChicagoStylePepperoniPizza();
		}else{
			return null;
		}
	}

}

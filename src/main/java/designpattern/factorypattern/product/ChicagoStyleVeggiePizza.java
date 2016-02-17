package designpattern.factorypattern.product;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza(){
		super.setName("Chicago Style Veggie Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauce("Marinara Sauce");
		List<String> list = new ArrayList<String>();
		list.add("Grated Reggiano Cheese");
		super.setToppings(list);
	}
}

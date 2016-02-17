package designpattern.factorypattern.product;

import java.util.ArrayList;
import java.util.List;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza(){
		super.setName("NY Style Veggie Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauce("Marinara Sauce");
		List<String> list = new ArrayList<String>();
		list.add("Grated Reggiano Cheese");
		super.setToppings(list);
	}
}

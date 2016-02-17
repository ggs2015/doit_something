package designpattern.factorypattern.product;

import java.util.ArrayList;
import java.util.List;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza(){
		super.setName("NY Style Pepperoni Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauce("Marinara Sauce");
		List<String> list = new ArrayList<String>();
		list.add("Grated Reggiano Cheese");
		super.setToppings(list);
	}
}

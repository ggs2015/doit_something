package designpattern.factorypattern.product;

import java.util.ArrayList;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza(){
		super.setName("NY Style Sauce and Cheese Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauce("Marinara Sauce");
		List<String> list = new ArrayList<String>();
		list.add("Grated Reggiano Cheese");
		super.setToppings(list);
//		name = "NY Style Sauce and Cheese Pizza";
//		dough = "Thin Crust Dough";
//		sauce = "Marinara Sauce";
//		
//		toppings.add("Grated Reggiano Cheese");
	}
	
}

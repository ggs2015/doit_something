package designpattern.factorypattern.product;

import java.util.ArrayList;
import java.util.List;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza(){
		super.setName("NY Style Clam Pizza");
		super.setDough("Thin Crust Dough");
		super.setSauce("Marinara Sauce");
		List<String> list = new ArrayList<String>();
		list.add("Grated Reggiano Cheese");
		super.setToppings(list);
	}
}

package designpattern.factorypattern.product;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza(){
		setName("Chicago Style Deep Dish Cheese Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
		List<String> list = new ArrayList<String>();
		list.add("Shredded Mozzarella Cheese");
		super.setToppings(list);
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}

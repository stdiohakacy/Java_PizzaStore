import java.util.ArrayList;

public class Pizza {
	public String name;
	public String dough;
	public String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Prepare " + this.name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding toppings : ");
		for (String topping : this.toppings) {
			System.out.println(" " + topping);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350 d");
	}

	public void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official Pizza store box");
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

// Chicago Style
class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		this.name = "Chicago Style Deep Dish Cheese Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}

class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		this.name = "Chicago Style Clam Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Frozen Clams from Chesapeake Bay");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}

class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		this.name = "Chicago Style Pepperoni Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}

class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		this.name = "Chicago Deep Dish Veggie Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}

// New York Style
class NewYorkStyleCheesePizza extends Pizza {
	public NewYorkStyleCheesePizza() { 
		this.setName("NY Style Sauce and Cheese Pizza");
		this.setDough("Thin Crust Dough");
		this.setSauce("Marinara Sauce");
 
		toppings.add("Grated Reggiano Cheese");
	}
}

class NewYorkStyleClamPizza extends Pizza {

	public NewYorkStyleClamPizza() {
		this.name = "NY Style Clam Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}

class NewYorkStylePepperoniPizza extends Pizza {

	public NewYorkStylePepperoniPizza() {
		this.name = "NY Style Pepperoni Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Sliced Pepperoni");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}

class NewYorkStyleVeggiePizza extends Pizza {
	public NewYorkStyleVeggiePizza () {
		this.name = "NY Style Veggie Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
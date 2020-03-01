
public class DependentPizzaStore {
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if(style.equals("newyork")) {
			switch (type) {
				case "cheese":
					pizza = new NewYorkStyleCheesePizza();
					break;
				case "veggie":
					pizza = new NewYorkStyleVeggiePizza();
				case "clam":
					pizza = new NewYorkStyleClamPizza();
				case "pepperoni":
					pizza = new NewYorkStylePepperoniPizza();
			}
		}
		else if(style.equals("chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		}
		else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

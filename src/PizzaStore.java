
public abstract class PizzaStore {
	public abstract Pizza createPizza(String item);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

class ChicagoPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		}
		else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		}
		else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		}
		return null;
	}
}

class NewYorkPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new NewYorkStyleCheesePizza();
		}
		else if (item.equals("veggie")) {
			return new NewYorkStyleVeggiePizza();
		}
		else if (item.equals("clam")) {
			return new NewYorkStyleClamPizza();
		}
		else if (item.equals("pepperoni")) {
			return new NewYorkStylePepperoniPizza();
		}
		return null;
	}
}
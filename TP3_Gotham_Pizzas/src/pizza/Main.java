package pizza;

import java.util.Arrays;

import pizza.Pizza.PizzaSize;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Long numTel = (Long)(long) 0631262626;
		Long cc = (Long) (long)597065655;
		Client client = new Client(cc, numTel, "21 Boulevard de Metz","Marcel Dupont");
		Pizza p = new Pizza(5, "t", "t", PizzaSize.Petite);
		Pizza [] pizzas = new Pizza [5];
		Arrays.fill(pizzas, p);
		client.createCommande(pizzas);
	}

}

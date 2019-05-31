package pizza;

import java.util.Date;

public class Commande {

	// ATTRIBUTES
	private Client client;
	private Collaborateur collaborateur;
	private Date dateLivraison;
	private Pizza[] pizzas;
	
	// CONSTRUCTOR
	public Commande(Client client, Date date, Pizza [] pizzas) {
		this.setClient(client);
		this.setDateLivraison(date);
		if(pizzas.length > 5) {
			this.pizzas = new Pizza[5];
			short i;
			for(i=0; i<5 ; i++) {
				this.pizzas[i] = pizzas[i];
			}
		}else {			
			this.pizzas = pizzas;
		}
	}
	
	// GETTERS && SETTERS
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Collaborateur getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public Pizza[] getPizzas() {
		return pizzas;
	}
	
	// METHODS
	
	public void prepare() throws Exception {
		//REGISTER COMMAND TO THE SYSTEM
	}
	public void deliver() {
		
	}
}

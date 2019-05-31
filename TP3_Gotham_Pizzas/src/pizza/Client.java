package pizza;

import java.util.ArrayList;
import java.util.Date;

public class Client extends Personne{
	
	private Long m_numCC;
	private ArrayList<Commande> commandes;

	public Client(Long numCC, Long numTel, String address, String name) {
		super(numTel, address, name);
		this.setNumCC(numCC);
		commandes = new ArrayList<Commande>();
	}
	
	public void createCommande(Pizza[] pizzas) {
		commandes.add(new Commande(this, new Date(), pizzas));
	}

	public Long getNumCC() {
		return m_numCC;
	}

	public void setNumCC(Long m_numCC) {
		this.m_numCC = m_numCC;
	}
	
	public Commande getCommande(int id) {
		return commandes.get(id);
	}
}

package pizza;

import java.util.ArrayList;
import java.util.HashMap;

public class Systeme {
	
	private ArrayList<Commande> ordersInProgress;
	private ArrayList<Commande> ordersReady;
	private HashMap<Collaborateur, PointPizza> collabsPP;
	
	public Systeme() {
		collabsPP = new HashMap<Collaborateur, PointPizza>();
		ordersInProgress = new ArrayList<Commande>();
		ordersReady = new ArrayList<Commande>();

	}
	
	public void newCollab(Collaborateur collab, PointPizza p) {
		collabsPP.put(collab, p);
	}
	
	public void affect(Collaborateur c, PointPizza p) {
		collabsPP.put(c, p);
	}
}

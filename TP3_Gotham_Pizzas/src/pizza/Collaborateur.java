package pizza;

public class Collaborateur {

	private Long x;
	private Long y;
	private Long z;
	private Commande commande;
	private PointPizza lieuTravail;
	
	public Collaborateur(Long x, Long y, Long z, Commande commande, PointPizza ldt) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.commande = commande;
		this.lieuTravail = ldt;
	}
	
	public void sendCoord() {
		
	}
}

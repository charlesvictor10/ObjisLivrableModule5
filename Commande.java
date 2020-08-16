public class Commande(){
	private int id;
	private int quantite;
	private double prix;

	// relation entre personne et commande
	// private Personne personne; 


	public Commande(){

	}

	public Commande(int quantite, double prix){
		this.quantite = quantite;
		this.prix = prix;
	}

	//getter et setter
}
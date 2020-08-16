public class Personne(){
	private int id;
	private String prenom;
	private String nom;
	private String email;

	private Collection<Commande> commandes;

	public Personne(){

	}

	public Personne(String prenom, String nom, String email){
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
	}

	// getter et setter
}
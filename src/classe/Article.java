package classe;

public class Article {
	
	//Attributs
	private long reference;
	private String intitule;
	private float prixHT;
	private int quantiteEnStock;
	
	//Constructeur
	public Article() {
		
	}
	
	//Constructeur immédiat
	public Article(long reference, String intitule, float prixHT, int quantiteEnStock) {
		super();
		this.reference = reference;
		this.intitule = intitule;
		this.prixHT = prixHT;
		this.quantiteEnStock = quantiteEnStock;
	}
	
	//Methodes
	public long getReference() {
		return reference;
	}

	//public void setNumero(String numero) {
		//this.numero = numero;
	//}
	
	public String getIntitule() {
		return intitule;
	}
	
	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}
	
	public void approvisionner(int nombreUnites) {
		//Augmentation de la quantité dispo de l'article
		this.quantiteEnStock = quantiteEnStock + nombreUnites;
	}
	
	public boolean vendre(int nombreUnites) {
		//Enregistrement d'une vente d'article
		if(this.quantiteEnStock > 0 && this.quantiteEnStock >= nombreUnites)
		{
			this.quantiteEnStock = quantiteEnStock - nombreUnites;
			return true;
		}			
		else
			return false;
	}
}

package compte;

public class Account_Epargne extends account{
	public float taux;
	
	public Account_Epargne() {
		super();
		this.taux=taux;
	}
	
	public void getTaux() {
		System.out.println("le taux d'interet est de "+this.taux+" %");
	}
	public float setTaux(float taux1) {
		System.out.println("vous venez de modifier le taux d'interet ");
		this.taux=taux1;
		return taux1;
	}
	public float ajout() {
		 return this.solde=this.solde+(this.solde*this.taux);
	}
	public int nbr_cpte_epargne() {
		System.out.println("le nombre de compte epargne est de "+this.instance);
		return this.instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

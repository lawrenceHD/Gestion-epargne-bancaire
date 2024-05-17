package compte;

public class account {

	public static int numero;
	public static float solde=0;
	int instance=0;
	public static String nom_client;
	
	public account() {
		this.numero=numero;
		this.solde=solde;
		this.instance=instance+1;
	}
	public float crediter(float montant_credit) {
		this.solde=this.solde+montant_credit;
		return this.solde;
	}
	
	public float debiter(float montant_debit) {
		this.solde=this.solde-montant_debit;
		return this.solde;
	}
	public void getsolde() {
		System.out.println("le solde de votre compte est de"+this.solde);
	}
	public int  nbre_cmpte() {
		return this.instance;
	}
    public account duplication(account cpt) {
    	cpt.numero=this.numero;
    	cpt.solde=this.solde;
    	return cpt;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

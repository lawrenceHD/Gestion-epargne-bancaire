package compte;

public class Client {

public static String nom;
String adresse;
float c_affaire;
int nbre_cmpte;
public Client() {
	this.nom=nom;
	this.adresse=adresse;
	this.c_affaire=c_affaire;
}
public Client(String nom, String adresse) {
	this.nom=nom;
	this.adresse=adresse;
	this.c_affaire=c_affaire;
}
public void getClient() {
	System.out.println("nom: "+this.nom+" adresse "+this.adresse+"chiffre d'affaire"+this.c_affaire);
}
public float setClient(String nom, String adresse, float c_affaire) {
	this.nom=nom;
	this.adresse=adresse;
	this.c_affaire=c_affaire;
	return c_affaire;
}
public int ajout_account() {
	if(nbre_cmpte>=5)
		System.out.println("desolé ce client a atteint la limite de compte!!!");
	else {
		account.nom_client=this.nom;
	this.nbre_cmpte=this.nbre_cmpte+1;
	System.out.println("compte cree avec succes!");
	}
	return this.nbre_cmpte;
}
/*public float solde_account() {
	float solde=0;
	if(account.nom_client==this.nom)
		solde=account.solde;
	return solde;
}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package compte;

public class Account_Cheque extends account {
	float valeur_max;
	
	public Account_Cheque() {
		super();
		this.valeur_max=valeur_max;
	}
	public void getV_max() {
		System.out.println("la valeur max du decouvert est" +valeur_max);
	}
	public float setv_max(float v_max) {
		this.valeur_max=v_max;
		return this.valeur_max;
	}
	public int nbr_cpt_cheque() {
		return this.instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

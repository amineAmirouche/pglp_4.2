package uvsq.pglp_4x2;

public enum CalculatriceRPN{
	ENVIRONNEMENT;
	
	public void run( String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		saisie.saisie();
	}
	
	public static void main( String[] args ) {
		ENVIRONNEMENT.run(args);
		
	}
}
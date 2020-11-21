public enum enumJourPlus {
	LUNDI(8), MARDI(9), MERCREDI(4), JEUDI(8), VENDREDI(7), SAMEDI(0), DIMANCHE(0);
	private int nbHeures;
	enumJourPlus(int nb) {nbHeures = nb;}
	public int getNbHeures() {return nbHeures;}
	public String action() {
		switch(this) {
			case SAMEDI : return "cinema";
			case DIMANCHE : return "dormir";
			default : return "travailler"; 
			
		}
 	}
}

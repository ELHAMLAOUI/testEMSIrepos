class EssaiJourPlus {
	public static void main(String[] arg) {
		enumJourPlus unJour = enumJourPlus.SAMEDI;
		System.out.println("numero de " + unJour + " : " + unJour.ordinal());
		System.out.println(unJour + " : " + unJour.action());
		for (enumJourPlus jour : enumJourPlus.values())
			System.out.println("nombre d'heures de " + jour + " : " + jour.getNbHeures());
	}
}

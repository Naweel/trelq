package com.projet.model;

public abstract class AJoueur {
	
	//Attributs
	
	/**
	 * Un AJoueur est une classe abstraite qui sera implement�e par Joueur et qui contient :
	 * la zone a la quelle il est 
	 * son prenom 
	 * le nombre de fois qu'une action est faite 
	 * et des methodes actions a redefinir
	 */
	
	private final  String prenom;
	private Zone zone;
	public static int nbAction;
	
	
	///Constructeurs
	
	public AJoueur(String prenom,Zone zone) {
		this.prenom=prenom;
		this.zone=zone;
		AJoueur.nbAction=0;
	}
	
	//Methodes:getteurs() et setteurs()

	public static int getNbAction() {
		return nbAction;
	}

	public static void setNbAction(int nbAction) {
		AJoueur.nbAction = nbAction;
	}

	public String getPrenom() {
		return prenom;
	}


	public Zone getZone() {
		return zone;
	}


	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	//Actions a faire 
	
	public abstract void deplacer();
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	

}

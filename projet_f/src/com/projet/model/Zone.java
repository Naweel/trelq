package com.projet.model;

import java.util.ArrayList;

public class Zone {
	
	//Attributs
	
	/**
	 * On observe un pointeur vers la grille(ile) a la quelle elle appartient:grille
	 * l'etat dans lequel est la zone qu'on modelise par :
	 * 0:NORMALE
	 * 1:INONDEE
	 * et 2:SUBMERGEE
	 * les coordonn�es x,y de chaque zone dans la grille
	 */
	
	
	
	public static final int NORMALE=0,INONDEE=1,SUBMERGEE=2;
	private Grille grille;
	protected int etat;
	private final int x , y;
	
	//Constructeur
	
	public Zone(Grille grille,int x,int y) {
		this.grille=grille;
		this.x=x;
		this.y=y;
		this.etat=NORMALE;
	}
	
	//Methodes:getteurs() et setteurs()

	
	public Grille getGrille() {
		return this.grille;
	}

	public void setGrille(Grille grille) {
		this.grille = grille;
	}

	public int getEtat() {
		return this.etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	//Metode qui teste si une zone est accessible ou pas 
	
	public boolean isAccessible(int x,int y) {
		return (0<=x && x<Grille.HAUTEUR && 0<=y && y<Grille.LARGEUR);
	}
	
	//methode qui retourne les zones voisins dans un Arraylist
	public ArrayList<Zone> voisins(){
		ArrayList<Zone>vois=new ArrayList<>();
		int x=this.getX();
		int y=this.getY();
		
		for(int i=x-1; i<=x+1; i++) {
		    for(int j=y-1; j<=y+1; j++) {
			if (this.isAccessible(x, y)) {
				vois.add(this.grille.getZone(x, y)); 
				}
		    }
		}
		return vois;
	}
	
	//Affichage
	
	@Override
	public String toString() {
		return "Etat: "+this.etat+"Coordonn�es: ("+this.x+","+this.y+")";
	}

	

}

package com.projet.model;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Grille extends Observable {
	
	//Attributs
	
	/**
	 * On se fixe la taille de la grille (ile) avec HAUTEUR et LARGEUR
	 * on stocke le tableau de zones (a deux dimensions)
	 */
	
	public static final int HAUTEUR=15,LARGEUR=15;
	private Zone [][] zones;
	
	
	//Constructeurs
	
	public Grille() {
		this.zones=new Zone[HAUTEUR][LARGEUR];
		for (int i = 0; i < HAUTEUR; i++) {
			for (int j = 0; j < LARGEUR; j++) {
				this.zones[i][j]=new Zone(this, i, j);
				
			}
			
		}
		//this.init();  // pour initialiser la grille de facon aleatoire
	}
	
	public void init() {
		for(int i=0; i<HAUTEUR; i++) {
		    for(int j=0; j<LARGEUR; j++) {
			if (Math.random() < 0.2) {
			    this.zones[i][j].etat = Zone.INONDEE;
				}
			else if(Math.random() >= 0.2 && Math.random() < 0.7) {
				this.zones[i][j].etat = Zone.SUBMERGEE;
				}
		    }
		}

	}
	
	public Zone getZone(int x,int y) {
		return this.zones[x][y];
	}
	
	public void commande() {
		int compteur=0;
		Random r = new Random();
		while(compteur<3 && this.getNbSubmergee()<LARGEUR*HAUTEUR) {
			
	        int i = r.nextInt(HAUTEUR);
	        int j = r.nextInt(LARGEUR);
			if(this.getZone(i, j).getEtat()!=Zone.SUBMERGEE) {
				this.getZone(i, j).setEtat(Zone.SUBMERGEE);
				compteur++;
			
			}
		}
		this.notifyObservers();
		
	}
	
	//Compte le nombre de zone submerg�e
	public int getNbSubmergee() {
		return this.zoneSubmergee().size();
	}
	
	//retourne les zones submerg�es dans un ArrayList de zones
	
	public ArrayList<Zone> zoneSubmergee(){
		ArrayList<Zone>Azones=new ArrayList<>();
		
		for (int i = 0; i < HAUTEUR; i++) {
			for (int j = 0; j < LARGEUR; j++) {
				if(this.getZone(i, j).getEtat()==Zone.SUBMERGEE) {
					Azones.add(this.getZone(i, i));
				}	
			}
		}
		return Azones;
	}

	@Override
	public String toString() {
		String affi="";
		for (int i = 0; i < HAUTEUR; i++) {
			for (int j = 0; j < LARGEUR; j++) {
				affi+=this.getZone(i, j).toString();
				
			}
			
		}
		return affi;
	}
	
	
}	



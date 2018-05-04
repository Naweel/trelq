package com.projet.model;

import java.util.Iterator;

public class Joueur extends AJoueur{

	public Joueur(String prenom, Zone zone) {
		super(prenom, zone);
		
	}

	@Override
	public void deplacer() {
		for (Zone vois  : this.getZone().voisins()) {
			if(!this.getZone().getGrille().zoneSubmergee().contains(vois)) {
				this.setZone(vois);
				break;
			}
			
		}
	this.getZone().getGrille().notifyObservers();
	AJoueur.nbAction++;
	}

}

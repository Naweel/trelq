package com.projet.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.projet.model.Grille;
import com.projet.model.Joueur;
import com.projet.model.Zone;

public class ControleurDeplacer implements ActionListener {
	
	
	Joueur joueur;
    public ControleurDeplacer(Joueur joueur) { this.joueur=joueur; }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(this.joueur.getNbAction()<=3) {
			this.joueur.deplacer();
		}
		
		
	}

}

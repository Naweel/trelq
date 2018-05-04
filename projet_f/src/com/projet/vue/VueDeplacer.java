package com.projet.vue;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.projet.controleur.Controleur;
import com.projet.controleur.ControleurDeplacer;
import com.projet.model.Grille;
import com.projet.model.Joueur;
import com.projet.model.Zone;

public class VueDeplacer extends JPanel {

	/**
     * Pour que le bouton puisse transmettre ses ordres, on garde une
     * référence au modèle.
     */
    Joueur joueur;
    

    /** Constructeur. */
    public VueDeplacer(Joueur joueur,String nom) {
	this.joueur = joueur;
		 
	JButton deplacer = new JButton(nom);
	this.add(deplacer);
	ControleurDeplacer ctrl = new ControleurDeplacer(joueur);
	/** Enregistrement du contrôleur comme auditeur du bouton. */
	deplacer.addActionListener(ctrl);
	
	
    }
	
	
}

package com.projet.vue;
import com.projet.controleur.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.projet.model.Grille;

public class VueCommande extends JPanel {
	
	 /**
     * Pour que le bouton puisse transmettre ses ordres, on garde une
     * référence au modèle.
     */
    private Grille modele;
    

    /** Constructeur. */
    public VueCommande(Grille modele ,String nom) {
	this.modele = modele;
		 
	JButton boutonFinTour = new JButton(nom);
	this.add(boutonFinTour);
	Controleur ctrl = new Controleur(modele);
	/** Enregistrement du contrôleur comme auditeur du bouton. */
	boutonFinTour.addActionListener(ctrl);
	
	
    }
	
	

}

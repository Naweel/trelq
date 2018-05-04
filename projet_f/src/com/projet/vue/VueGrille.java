package com.projet.vue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.projet.model.*;

public class VueGrille extends JPanel implements Observer {
	
	/**
	 * Contient une reference vers le modele Grille
	 * definit une taille en pixels pour l'affichage des zones 
	 * enregistre la vue comme observer de modele(grille)
	 */
	
	//Attributs
	private Grille grille;
	private static final int TAILLE=30;
	
	//Constructeurs
	
	public VueGrille(Grille grille) {
		this.grille=grille;
		this.grille.addObserver(this);
		this.setPreferredSize(new Dimension(TAILLE*Grille.HAUTEUR,TAILLE*	Grille.LARGEUR));
		
	}
	
	//Methodes
	

	@Override
	public void update() {
		this.repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.repaint();
		for(int i=0; i<Grille.HAUTEUR; i++) {
		    for(int j=0; j<Grille.LARGEUR; j++) {
			this.paint(g, this.grille.getZone(i, j), i*TAILLE, j*TAILLE);
		    }
		}
	}
	
	private void paint(Graphics g, Zone c, int x, int y) {
        /** Sélection d'une couleur. */
	if (c.getEtat()==Zone.NORMALE) {
	    g.setColor(Color.WHITE);
	} else if (c.getEtat()==Zone.INONDEE) {
            g.setColor(Color.BLACK);
        }
	else {
		g.setColor(Color.RED);
	}
        /** Coloration d'un rectangle. */
        g.fillRect(x, y, TAILLE, TAILLE);
        
    }
	

}

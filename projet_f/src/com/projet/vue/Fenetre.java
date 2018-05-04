package com.projet.vue;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import com.projet.model.Grille;
import com.projet.model.*;

public class Fenetre {
	
	private JFrame frame;
	private VueGrille grille;
	private VueCommande commande;
	private VueDeplacer deplacer;
	private Zone zone;
	private Joueur joueur;
	
	public Fenetre(Grille ile) {
		frame = new JFrame();
		frame.setTitle("L'Ile Interdite");
		
		frame.setLayout(new FlowLayout());
		
		this.zone=ile.getZone(0, 0);
		this.joueur=new Joueur("Sanou",this.zone);
		/** Définition des deux vues et ajout �  la fenêtre. */
		this.grille = new VueGrille(ile);
		this.frame.add(grille);
		this.commande = new VueCommande(ile,"Fait un tour");
		this.frame.add(commande);
		this.deplacer=new VueDeplacer(joueur,"Deplacer");
		this.frame.add(deplacer);
		
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	

}

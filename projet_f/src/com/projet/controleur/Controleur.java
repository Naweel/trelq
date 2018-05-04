package com.projet.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.projet.model.Grille;

public class Controleur implements ActionListener {
    /**
     * On garde un pointeur vers le modèle, car le contrôleur doit
     * provoquer un appel de méthode du modèle.
     * Remarque : comme cette classe est interne, cette inscription
     * explicite du modèle est inutile. On pourrait se contenter de
     * faire directement référence au modèle enregistré pour la classe
     * englobante [VueCommandes].
     */
    Grille modele;
    public Controleur(Grille modele) { this.modele = modele; }
    /**
     * Action effectuée �  réception d'un événement : appeler la
     * méthode [avance] du modèle.
     */
    public void actionPerformed(ActionEvent e) {
        this.modele.commande();
        
        
    }
}

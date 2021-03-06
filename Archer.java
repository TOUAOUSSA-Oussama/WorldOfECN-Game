/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe Archer : sous-classe de Personnage
 * @author Groupe 24
 */
public class Archer extends Personnage implements Combattant {
    // Nombre de fleches
    private int nbFleches;
    
    // Constructeurs avec plusieurs parametres
    
    /**
     * Constructeur Archer
     * @param nom Nom de l'Archer
     * @param ptV points vie
     * @param pA pourcentage attaque
     * @param pP pourcentage par?
     * @param pM pourcentage magie
     * @param rM pourcentage resistance magie
     * @param dA degats d'attaque
     * @param dM degats magie
     * @param distMax distance d'attaque maximal
     * @param pos position d'Archerr dans le monde
     * @param ptPar points de paries
     * @param nbF nombre de fleshes
     */
    
    public Archer(String nom, int ptV, int ptM, int pA, int pP, int pM, int rM, int dA, int dM, int distMax, Point2D pos, int ptPar, int nbF, ArrayList<Nourriture> listNourriture) {
        super(nom, ptV, ptM, pA, pP, pM, rM, dA, dM, distMax, pos, ptPar, listNourriture);
        this.nbFleches = nbF;
    }
    
     /**
     * Constructeur de recopie d'Archer à partir d'un objet Archer
     *
     * @param a objet Archer
     */
    public Archer(Archer a) {
        super(a);
        this.nbFleches = a.nbFleches;

    }
    /**
     * afficher les coordonnes d'un Archer
     */
    public Archer() {
        super();
        this.nbFleches = 0;
    }
    
    // Definiton des methodes 
    /**
     * Permet d'afficher le nom d'Archer
     */
    @Override
    public void affiche(){
        System.out.println("Je suis un " + this.getNom());
        
    }
/**
   * Combat à distance
   * @param c Creature
   */
  @Override
  public void combattre(Creature c) {
    double distance = Point2D.distance(this.getPos(),c.getPos());
    if (this.getNbFleches() == 0){
        System.out.print("Plus de flèches!");
    }
    if (distance > 1 && distance <= this.getDistAttMax()) {
      this.nbFleches -=1;
      Random rInt = new Random();
      if (rInt.nextInt(100) + 1 <= this.getPourcentageAtt()) {
        int damage;
        damage = this.getDegAtt();
        c.setPtVie(Math.max(c.getPtVie() - damage, 0));
        System.out.println("Attaque réussi avec un dégat de: " + Math.max(c.getPtVie() - damage, 0) );
      } else {
        System.out.println("attaque ratée!");
      }
    } else {
      System.out.println(" Trop loin! Distance: " + distance);
    }
  }
  
    // Definition des getters et des setters
    public int getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }

}

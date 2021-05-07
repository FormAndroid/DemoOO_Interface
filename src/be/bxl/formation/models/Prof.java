package be.bxl.formation.models;

import be.bxl.formation.interfaces.IProf;

public class Prof extends Personne implements IProf {

    public Prof(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void donnerCours(String cours) {
        System.out.println(getNomComplet() + " donne le cours de " + cours);
    }

    @Override
    public void preparerCours(String cours) {
        System.out.println(getNomComplet() + " préparer son cours de " + cours);
    }

    @Override
    public void corrigerCopies() {
        System.out.println(getNomComplet() + " corrige des copies");
    }
}

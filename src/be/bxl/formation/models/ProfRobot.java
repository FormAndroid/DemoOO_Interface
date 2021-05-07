package be.bxl.formation.models;

import be.bxl.formation.interfaces.IProf;

public class ProfRobot implements IProf {

    @Override
    public String getNom() {
        return "La machine à baffe";
    }

    @Override
    public void donnerCours(String cours) {
        System.out.println(getNom() + " donner des cours");
    }

    @Override
    public void preparerCours(String cours) {
        System.out.println(getNom() + " met a jours son logiciel");
    }

    @Override
    public void corrigerCopies() {
        System.out.println(getNom() + " est en veille...");
    }
}

package org.humanbooster.project;

public class CompteEpargne extends Compte{
    private float taux= 0.75f;
    private float interets;

    public CompteEpargne(float solde) {
        super(solde);
    }

    public float calculInterets(){
        interets = solde * taux;
        solde += interets;
        System.out.println("les intérêts sont de l'ordre de : "+ interets +" et votre solde est de "+solde);

        return interets;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "solde=" + solde +
                ", taux=" + taux +
                ", interets=" + interets +
                '}';
    }
}

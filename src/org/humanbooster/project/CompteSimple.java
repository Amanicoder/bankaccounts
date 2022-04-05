package org.humanbooster.project;

public class CompteSimple extends Compte{
    private float decouvert;

    public CompteSimple(float decouvert) {
        this.decouvert = decouvert;
    }

    public CompteSimple(float solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public float retirer(float montant) {
            if (montant <= (solde+decouvert)) {
                solde = solde - montant;
            } else {
                System.out.println("solde insuffisant compte simple : " + solde);
            }
            System.out.println("solde compte simple = " + solde);
            return solde;
    }

    @Override
    public String toString() {
        return "CompteSimple{" +
                "decouvert=" + decouvert +
                '}';
    }
}

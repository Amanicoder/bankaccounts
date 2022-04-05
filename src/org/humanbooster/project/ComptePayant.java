package org.humanbooster.project;

public class ComptePayant extends Compte{

    public ComptePayant() {
    }

    public ComptePayant(float solde) {
        super(solde);
    }

    public float verser(float montant){
        solde = solde + montant -1;
        System.out.println("solde compte payant payant = " + solde);
        return solde;
    }

    public float retirer(float montant){

        if ((montant+1) <= solde) {
            solde = solde - montant -1;
        } else {
            System.out.println("solde insuffisant compte payant");
        }
        System.out.println("solde compte payant amani = " + solde);
        return solde;

    }

    @Override
    public String toString() {
        return "ComptePayant{" +
                "solde=" + solde +
                '}';
    }
}

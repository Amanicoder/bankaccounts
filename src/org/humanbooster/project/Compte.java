package org.humanbooster.project;

public class Compte {
    private int id;
    protected float solde;
    private static int countComptes;
    private static float montant;

    public Compte() {
    }

    public Compte(float solde) {
        this.solde = solde;
    }

    public static void main(String[] args) {
       Compte c1 = new Compte(500);
        c1.verser(30);
        c1.retirer(400);
        c1.retirer(150);

        CompteEpargne c2 = new CompteEpargne(500);
        c2.calculInterets();

        ComptePayant c3 = new ComptePayant(300);
        c3.retirer(299);
        c3.verser(100);

        CompteSimple c4 = new CompteSimple(400, 50);
        c4.retirer(450);
        c4.verser(60);
        c4.retirer(550);
    }

    public float verser(float montant){
        solde = solde + montant;
        System.out.println("solde = " + solde);
        return solde;
    }
    public float retirer(float montant){
        if (montant <= solde) {
            solde = solde - montant;
        } else {
            System.out.println("solde insuffisant");
        }
        System.out.println("solde = " + solde);
        return solde;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", countComptes=" + countComptes +
                '}';
    }


}

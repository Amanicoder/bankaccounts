package org.humanbooster.project.humanoid;

public class Wizard extends Humanoid{
    private int mana;
    private int intelligence;
    private boolean shield;
    private int hitsOnShield;

    public Wizard(int mana, int intelligence, boolean shield, int hitsOnShield) {
        this.mana = mana;
        this.intelligence = intelligence;
        this.shield = shield;
        this.hitsOnShield = hitsOnShield;

        /*public void spellCast(Humanoid){
            receiveDamage();
            mana = mana -10;
        }
        public void activateShield(){

        }
        public void addMana(int mana){

        }*/

    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                ", shield=" + shield +
                ", hitsOnShield=" + hitsOnShield +
                '}';
    }
}

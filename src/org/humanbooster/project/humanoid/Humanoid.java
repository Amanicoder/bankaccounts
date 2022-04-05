package org.humanbooster.project.humanoid;

public class Humanoid {
    protected String name;
    protected double health;
    protected int force;

    public Humanoid() {
    }

    public Humanoid(String name, double health, int force) {
        this.name = name;
        this.health = health;
        this.force = force;
    }
    public void attack(Humanoid h){
        this.health = this.health - h.force;
        //h.health = h.health -this.force;
    }
    public void receiveDamage(double damage){
        this.health = this.health - damage;
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                '}';
    }
}

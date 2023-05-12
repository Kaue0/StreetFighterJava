package main;

public abstract class Fighter {
    protected String name;
    protected double power;
    protected double life;
    protected Special special;

    public Fighter(String name, double power, double life, Special special) {
        this.name = name;
        this.power = power;
        this.life = life;
        this.special = special;
    }

    public abstract void takeLife(Fighter fighter);

    public abstract void attack(Fighter fighter);

    public abstract void specialPower(Fighter fighter);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public Special getSpecial() {
        return special;
    }

    public void setSpecial(Special special) {
        this.special = special;
    }

    
}

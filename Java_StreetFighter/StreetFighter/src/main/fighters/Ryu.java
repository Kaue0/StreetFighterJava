package main.fighters;

import main.Fighter;
import main.Special;

public class Ryu extends Fighter {

    private int poderRyu = 0;

    public Ryu(String name, double power, double life, Special special) {
        super(name, power, life, special);
    }

    @Override
    public void takeLife(Fighter fighter) {
        fighter.setLife(fighter.getLife() - this.getPower());
    }

    @Override
    public void attack(Fighter fighter) {
        if(poderRyu == 3) {
            specialPower(fighter);
            poderRyu = 0;
            System.out.printf("Ryu efetuou seu golpe especial: %s \n", this.special.getName());
        }
        else {
            this.takeLife(fighter);
            poderRyu += 1;
            System.out.printf("Ryu atacou %s.\n", fighter.getName());
        }
    }

    @Override // O especial do Ryu é o com maior multiplicador
    public void specialPower(Fighter fighter) {
        fighter.setLife(fighter.getLife() - (this.getPower() * 3));
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
package main.fighters;

import main.Fighter;
import main.Special;

public class Ken extends Fighter {

    private int poderKen = 0;

    public Ken(String name, double power, double life, Special special) {
        super(name, power, life, special);
    }

    @Override
    public void takeLife(Fighter fighter) {
        fighter.setLife(fighter.getLife() - this.getPower());
    }

    @Override
    public void attack(Fighter fighter) {
        if(poderKen == 2) {
            specialPower(fighter);
            poderKen = 0;
            System.out.printf("Ken efetuou seu golpe especial: %s \n", this.special.getName());
        }
        else {
            this.takeLife(fighter);
            poderKen += 1;
            System.out.printf("Ken atacou %s.\n", fighter.getName());
        }
    }

    @Override // O especial do Ken diminui o poder do inimigo além de tirar vida
    public void specialPower(Fighter fighter) {
        fighter.setLife(fighter.getLife() - (this.getPower() * 2.5));
        fighter.setPower(fighter.getPower() - 2);
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}

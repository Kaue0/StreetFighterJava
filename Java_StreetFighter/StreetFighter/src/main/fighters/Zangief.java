package main.fighters;

import main.Fighter;
import main.Special;

public class Zangief extends Fighter {

    private int poderZangief = 0;
    private int tankShield = 4;

    public Zangief(String name, double power, double life, Special special) {
        super(name, power, life, special);
        this.setLife(this.getLife() + this.tankShield);
    }

    @Override // Blanka e Zangief serão 'tanks', logo terão mais vida porém recebem redução no dano
    public void takeLife(Fighter fighter) {
        fighter.setLife(fighter.getLife() - (this.getPower() - 1));
    }

    @Override
    public void attack(Fighter fighter) {
        if(poderZangief == 2) {
            specialPower(fighter);
            poderZangief = 0;
            System.out.printf("Zangief efetuou seu golpe especial: %s \n", this.special.getName());
        }
        else {
            this.takeLife(fighter);
            poderZangief += 1;
            System.out.printf("Zangief atacou %s.\n", fighter.getName());
        }
    }

    @Override // Especial do Zangief faz ele receber 1 de vida
    public void specialPower(Fighter fighter) {
        fighter.setLife(fighter.getLife() - (this.getPower() * 2));
        this.setLife(this.getLife() + 1);
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}

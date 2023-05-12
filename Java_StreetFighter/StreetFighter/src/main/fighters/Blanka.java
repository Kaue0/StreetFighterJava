package main.fighters;

import main.Fighter;
import main.Special;

public class Blanka extends Fighter {

    private int poderBlanka = 0;
    private int tankShield = 7;
    

    public Blanka(String name, double power, double life, Special special) {
        super(name, power, life, special);
        this.setLife(this.getLife() + this.tankShield);
    }

    @Override // Blanka e Zangief serão 'tanks', logo terão mais vida porém recebem redução no dano
    public void takeLife(Fighter fighter) {
        fighter.setLife(fighter.getLife() - (this.getPower() - 1.5));
    }

    @Override
    public void attack(Fighter fighter) {
        if(poderBlanka == 1) {
            specialPower(fighter);
            poderBlanka = 0;
            System.out.printf("Blanka efetuou seu golpe especial: %s \n", this.special.getName());
        }
        else {
            this.takeLife(fighter);
            poderBlanka += 1;
            System.out.printf("Blanka atacou %s.\n", fighter.getName());
        }
    }

    @Override // O especial do Blanka terá um multiplicador menor pois é usado com frequência
    public void specialPower(Fighter fighter) { 
        fighter.setLife(fighter.getLife() - (this.special.getValueSpecial() * 1.50));
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}

package main;

import java.util.Scanner;

import main.fighters.*;

public class Player {
    private String name;
    private Fighter fighter;
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }

    //Seleciona o personagem através do switch case
    public void pickFighter(Player player) {
        int character = 0;
        Scanner pick = new Scanner(System.in);
        while(player.getFighter() == null) {
            System.out.println("Digite o número de acordo com o personagem desejado: ");
            System.out.printf("\n1 - Blanka\n 2 - Ken\n 3 - Ryu\n 4 - Zangief\n");
            character = pick.nextInt();
            switch(character) {
                case 1:
                    player.setFighter(new Blanka("Blanka", 3, 9, new Special("Eletric Thunder", 2)));
                    System.out.printf("\nO personagem escolhido foi: %s\n\n", player.getFighter());
                    break;
                case 2:
                    player.setFighter(new Ken("Ken", 3, 10, new Special("Shoryuken", 3)));
                    System.out.printf("\nO personagem escolhido foi: %s\n\n", player.getFighter());
                    break;
                case 3:
                    player.setFighter(new Ryu("Ryu", 4, 8, new Special("Hadoken", 4)));
                    System.out.printf("\nO personagem escolhido foi: %s\n\n", player.getFighter());
                    break;
                case 4:
                    player.setFighter(new Zangief("Zangief", 3, 10, new Special("Double Lariat", 2.5)));
                    System.out.printf("\nO personagem escolhido foi: %s\n\n", player.getFighter());
                    break;
                default:
                    System.out.print("\nEssa não é uma opção válida, tente novamente\n");
                    break;
            }
        }    
    }
    
}

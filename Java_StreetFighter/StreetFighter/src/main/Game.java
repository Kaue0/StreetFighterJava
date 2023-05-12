package main;

public class Game {
    private Player player1;
    private Player player2;
    public String vencedor;

    public void startGameForTwoPlayers(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;

        player1.pickFighter(p1);
        player2.pickFighter(p2);
        
        battle(p1, p2);

    }

    //Calcula e mostra o resultado da batalha
    public void battle(Player p1, Player p2) {
        int playerToMove = 1;
        int rounds = 1;
        while(p1.getFighter().getLife() > 0 || p2.getFighter().getLife() > 0) {
            if(playerToMove == 1) {
                System.out.printf("\n########### ROUND %d ###########\n\n", rounds);
                p1.getFighter().attack(p2.getFighter());
                playerToMove = 2;
                if(p2.getFighter().getLife() <= 0)
                    break;
            } else {
                p2.getFighter().attack(p1.getFighter());
                rounds++;
                playerToMove = 1;
                if(p1.getFighter().getLife() <= 0)
                    break;

                System.out.printf("Vida do %s: %.1f\n", p1.getFighter(), p1.getFighter().getLife());
		        System.out.printf("Vida do %s: %.1f\n", p2.getFighter(), p2.getFighter().getLife());
            }

        }

        if(p2.getFighter().getLife() <= 0) {
            System.out.println("\n########### FINAL DA LUTA ###########");
            System.out.println("PLAYER 1 VENCEU A BATALHA");
            System.out.printf("Vida restante do %s: %.1f\n", p1.getFighter(), p1.getFighter().getLife());
            System.out.printf("Vida restante do %s: 0\n", p2.getFighter());
            vencedor = p1.getFighter().getName();

        } else {
            System.out.println("########### FINAL DA LUTA ###########");
            System.out.println("PLAYER 2 VENCEU A BATALHA");
            System.out.printf("Vida restante do %s: %.1f\n", p2.getFighter(), p2.getFighter().getLife());
            System.out.printf("Vida restante do %s: 0\n", p1.getFighter());
            vencedor = p2.getFighter().getName();
        }
    }
}
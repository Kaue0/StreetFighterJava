package main;

public class Start {
    public static void main(String[] args) {
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        Game g1 = new Game();

        //Inicia o jogo com os jogadores selecionados
        g1.startGameForTwoPlayers(p1, p2);
    }
}

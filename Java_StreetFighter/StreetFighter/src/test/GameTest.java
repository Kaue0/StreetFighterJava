package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.fighters.*;
import main.Player;
import main.Special;
import main.Game;

//player.setFighter(new Blanka("Blanka", 3, 9, new Special("Eletric Thunder", 2)));
//player.setFighter(new Ken("Ken", 3, 10, new Special("Shoryuken", 3)));
//player.setFighter(new Ryu("Ryu", 4, 8, new Special("Hadoken", 4)));
//player.setFighter(new Zangief("Zangief", 3, 10, new Special("Double Lariat", 2.5)));

//Testes Junit
public class GameTest {
    
    @Test
    public void blankaVence() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        player1.setFighter(new Blanka("Blanka", 7, 9, new Special("Eletric Thunder", 2)));
        player2.setFighter(new Zangief("Zangief", 3, 10, new Special("Double Lariat", 2.5)));
        Game game = new Game();
        game.battle(player1, player2);


        Assert.assertEquals("Blanka", game.vencedor);
    }

    @Test
    public void kenVence() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        player1.setFighter(new Ken("Ken", 500, 9, new Special("Shoryuken", 3)));
        player2.setFighter(new Zangief("Zangief", 3, 10, new Special("Double Lariat", 2.5)));
        Game game = new Game();
        game.battle(player1, player2);


        Assert.assertEquals("Ken", game.vencedor);
    }

    @Test
    public void ryuVence() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        player1.setFighter(new Ryu("Ryu", 7, 9, new Special("Hadoken", 4)));
        player2.setFighter(new Zangief("Zangief", 3, 10, new Special("Double Lariat", 2.5)));
        Game game = new Game();
        game.battle(player1, player2);


        Assert.assertEquals("Ryu", game.vencedor);
    }

    @Test
    public void zangiefVence() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        player1.setFighter(new Blanka("Blanka", 7, 9, new Special("Eletric Thunder", 2)));
        player2.setFighter(new Zangief("Zangief", 93, 10, new Special("Double Lariat", 2.5)));
        Game game = new Game();
        game.battle(player1, player2);


        Assert.assertEquals("Zangief", game.vencedor);
    }
}

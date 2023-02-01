package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    private Game game;

    public GameTest(){
        this.game = new Game();
    }
    @Test
    public void Tamagotchi_making_pop()
    {
        game.pastTime();
        assertEquals(1, game.getMyTamagotchi().getAge());
    }
}

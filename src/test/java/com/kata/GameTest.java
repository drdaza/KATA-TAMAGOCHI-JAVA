package com.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    private Game game;

    public GameTest(){
        this.game = new Game();
    }
     @Test
    public void Tamagotchi_feed_tamagotchi()
    {
        game.feedingTamagotchi();
        assertEquals(2, game.getMyTamagotchi().getHunger());
    }
    @Test
    public void Tamagotchi_play_tamagotchi()
    {
        

        
        assertEquals("(._.)", game.playingTamagotchi());
    }
    @Test
    public void Tamagotchi_check_is_awake()
    {
        
        
        assertEquals("(-_-) zZZ", game.goToSleepTamagotchi());
    } 
}

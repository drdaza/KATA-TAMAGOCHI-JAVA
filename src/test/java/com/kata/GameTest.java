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
    @Test
    public void Tamagotchi_check_past_time()
    {
        
        game.executeRules();
        assertEquals(2, game.getMyTamagotchi().getEnergy());
        assertEquals(6, game.getMyTamagotchi().getHunger());
        assertEquals(2, game.getMyTamagotchi().getFullness());
        assertEquals(2, game.getMyTamagotchi().getMood());
    } 

}

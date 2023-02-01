package com.kata;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.kata.Food.BasicFood;
import com.kata.Food.Food;

public class TamagotchiTest {

    private Tamagotchi myTamagotchi;
    private Food food;
    
    
    public TamagotchiTest() {
        this.myTamagotchi = new Tamagotchi();
        this.food = new BasicFood(2);
    }

    @Test
    public void Tamagotchi_eat_food()
    {
        myTamagotchi.feedingMe(food);

        assertEquals(2, myTamagotchi.getHunger());
        assertEquals(6, myTamagotchi.getFullness());
        assertEquals(5, myTamagotchi.getEnergy());
    }
    @Test
    public void Tamagotchi_play()
    {
        myTamagotchi.playingWithMe();

        assertEquals(5, myTamagotchi.getMood());
        assertEquals(5, myTamagotchi.getHunger());
        assertEquals(3, myTamagotchi.getEnergy());
    }
    @Test
    public void Tamagotchi_sleep()
    {
        myTamagotchi.iAmSleeping();

        assertEquals(6, myTamagotchi.getEnergy());
    }
    @Test
    public void Tamagotchi_making_pop()
    {
        myTamagotchi.makingPop();


        assertEquals(2, myTamagotchi.getFullness());
        
    }

}

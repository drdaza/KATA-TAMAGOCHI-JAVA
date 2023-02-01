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
    public void shouldAnswerWithTrue()
    {
        myTamagotchi.feedingMe(food);

        assertEquals(2, myTamagotchi.getHunger());
        assertEquals(6, myTamagotchi.getFullness());
        assertEquals(5, myTamagotchi.getEnergy());
    }

}

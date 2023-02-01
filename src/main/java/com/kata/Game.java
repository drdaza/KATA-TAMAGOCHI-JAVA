package com.kata;

import com.kata.Food.BasicFood;
import com.kata.Food.Food;

public class Game {
    private Tamagotchi myTamagotchi;
    private Rules rules;
    private int activity;
    private Food food;
    public Game(){
        this.myTamagotchi = new Tamagotchi();
        this.food = new BasicFood(2);
        this.rules = new TimeRules();
        if(rules instanceof TimeRules) this.activity = 1;
        if(rules instanceof NormalRules) this.activity = 0;
    }
    public Tamagotchi getMyTamagotchi() {
        return myTamagotchi;
    }
    public String feedingTamagotchi(){
        return rules.Feeding(myTamagotchi, food);
    }
    public String playingTamagotchi(){
        
        return rules.playing(myTamagotchi);
    }
    public String goToSleepTamagotchi(){
        return rules.Sleeping(myTamagotchi);
    }

/* para extender de una abstract class que implementa una interface? */
    
    
    
}

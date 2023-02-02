package com.kata;



import com.kata.Food.Food;

import com.kata.checker.CheckerWithTime;

public class TimeRules extends CheckerWithTime implements Rules {
    @Override
    public String Feeding(Tamagotchi tamagotchi, Food food) {
        tamagotchi.eat(food);
        setDaysPassed(0);
        return checkEnergy(tamagotchi);
    }
    @Override
    public String playing(Tamagotchi tamagotchi) {
        tamagotchi.play();
        setDaysPassed(0);

        return checkMood(tamagotchi);
    }
    @Override
    public String Sleeping(Tamagotchi tamagotchi) {
        tamagotchi.sleep();
        setDaysPassed(0);

        return checkIsAwake(tamagotchi);
    }
    @Override
    public void excecuteRules(Tamagotchi tamagotchi) {
        pastTime(tamagotchi);
        
    }
    
    
   
}
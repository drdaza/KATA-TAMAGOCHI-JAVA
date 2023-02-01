package com.kata;

import com.kata.Food.Food;

public interface Rules {
    public String checkEnergy(Tamagotchi tamagotchi);
    public String checkMood(Tamagotchi tamagotchi);
    public String checkIsAwake(Tamagotchi tamagotchi);
    public String Feeding(Tamagotchi tamagotchi, Food food);
    public String playing(Tamagotchi tamagotchi);
    public String Sleeping(Tamagotchi tamagotchi);
}

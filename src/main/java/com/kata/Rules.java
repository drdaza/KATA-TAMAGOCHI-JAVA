package com.kata;

import com.kata.Food.Food;

public interface Rules {
    public void excecuteRules(Tamagotchi tamagotchi);
    public String Feeding(Tamagotchi tamagotchi, Food food);
    public String playing(Tamagotchi tamagotchi);
    public String Sleeping(Tamagotchi tamagotchi);
}

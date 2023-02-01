package com.kata;

import com.kata.Food.Food;

public class Tamagotchi {
    
    private int mood;
    private int hunger;
    private int energy;
    private int fullness;
    private Boolean isAwake;
    
    public Tamagotchi() {
        this.mood = 4;
        this.hunger = 4;
        this.energy = 4;
        this.fullness = 4;
        this.isAwake = true;
    }
    public int getMood() {
        return mood;
    }
    public void setMood(int mood) {
        this.mood = mood;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getFullness() {
        return fullness;
    }
    public void setFullness(int fullness) {
        this.fullness = fullness;
    }
    public Boolean getIsAwake() {
        return isAwake;
    }
    public void setIsAwake(Boolean isAwake) {
        this.isAwake = isAwake;
    }
    public void feedingMe(Food food){
        setHunger(hunger-food.getValue());
        setFullness(fullness+food.getValue());
        setEnergy(energy+1);
    }
    public void playingWithMe(){
        setEnergy(energy-1);
        setHunger(hunger+1);
        setMood(mood+1);
    }
    public void iAmSleeping(){
        setEnergy(energy+2);
    }
    public void makingPop(){
        setFullness(fullness-2);
    }
}

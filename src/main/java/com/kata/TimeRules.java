package com.kata;

import java.time.LocalDate;

import com.kata.Food.Food;

public class TimeRules implements Rules{
    private int daysPassed;
    private LocalDate initlDate;
    
    public TimeRules() {
        this.initlDate = LocalDate.of(2023, 2, 1);
        this.daysPassed = 0;
    }
    public int getDaysPassed() {
        return daysPassed;
    }
    public void setDaysPassed(int daysPassed) {
        this.daysPassed = daysPassed;
    }
    public LocalDate getInitlDate() {
        return initlDate;
    }
    public void setInitlDate(LocalDate initlDate) {
        this.initlDate = initlDate;
    }
    public void pastTime(Tamagotchi tamagotchi){
        tamagotchi.setAge(LocalDate.now().plusDays(1).getDayOfYear() - initlDate.getDayOfYear());
        setDaysPassed(LocalDate.now().plusDays(1).getDayOfYear() - initlDate.getDayOfYear());
    }
    
    public String checkEnergy(Tamagotchi tamagotchi) {
        if(tamagotchi.getEnergy()==0){ 
            tamagotchi.setIsAwake(false);
            return "(-_-) zZZ";
        }
        if(tamagotchi.getEnergy()<3) return "(-_-)";
        if(tamagotchi.getEnergy()>=3) return "(o_o)";
        
        return "(x_x)";
    }
    
    public String checkMood(Tamagotchi tamagotchi) {
        if(tamagotchi.getMood()<2) return "(ఠ_ఠ)";
        if(tamagotchi.getMood()<=8 || tamagotchi.getMood() >= 2) return "(._.)";
        if(tamagotchi.getMood()>8) return "(:D)";

        return "(x_x)";
    }
    
     @Override
    public String checkIsAwake(Tamagotchi tamagotchi) {
        if(tamagotchi.getIsAwake()== false) return "(-_-) zZZ";
        return checkEnergy(tamagotchi);
    }

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
    public void test(){}
   
}
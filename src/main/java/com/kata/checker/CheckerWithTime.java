package com.kata.checker;

import java.time.LocalDate;

import com.kata.Tamagotchi;

public class CheckerWithTime extends Checker{
    private int daysPassed;
    private LocalDate initlDate;
    
    public CheckerWithTime() {
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
        tamagotchi.setEnergy(tamagotchi.getEnergy()-daysPassed);
        tamagotchi.setFullness(tamagotchi.getFullness()-daysPassed);
        tamagotchi.setHunger(tamagotchi.getHunger()+daysPassed);
        tamagotchi.setMood(tamagotchi.getMood()-daysPassed);
        tamagotchi.setAge(tamagotchi.getAge()+daysPassed);
    }
}

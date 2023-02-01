package com.kata;

import java.time.LocalDate;

public class Game {
    private Tamagotchi myTamagotchi;
    private int daysPassed;
    private LocalDate initlDate;
    public Game(){
        this.myTamagotchi = new Tamagotchi();
        this.daysPassed = 0;
        this.initlDate = LocalDate.of(2023, 2, 1);
    }
    public Tamagotchi getMyTamagotchi() {
        return myTamagotchi;
    }
    public int getDaysPassed() {
        return daysPassed;
    }
    public void setDaysPassed(int daysPassed) {
        this.daysPassed = daysPassed;
    }
    public void setMyTamagotchi(Tamagotchi myTamagotchi) {
        this.myTamagotchi = myTamagotchi;
    }
    public LocalDate getInitlDate() {
        return initlDate;
    }
    public void setInitlDate(LocalDate initlDate) {
        this.initlDate = initlDate;
    }
    public void pastTime(){
        int age = LocalDate.now().plusDays(1).getDayOfYear() - initlDate.getDayOfYear();

        myTamagotchi.setAge(age);

    }
    public String checkEnergy()
        {if(myTamagotchi.getEnergy()==0){ 
            myTamagotchi.setIsAwake(false);
            return "(-_-) zZZ";
        }
        if(myTamagotchi.getEnergy()<3) return "(-_-)";
        if(myTamagotchi.getEnergy()>=3) return "(o_o)";
        
        return "x_x";
    }
    
    
    
}

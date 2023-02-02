package com.kata.checker;

import com.kata.Tamagotchi;

public abstract class Checker {
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

    public String checkIsAwake(Tamagotchi tamagotchi) {
        if(tamagotchi.getIsAwake()== false) return "(-_-) zZZ";
        return checkEnergy(tamagotchi);
    }
}

package com.animalPattern;

public class Chicken extends Animal {
    private int numberOfClones = 0;

    @Override
    public String greetingAnimal() {
        StringBuffer chickenTalk = new StringBuffer();
        chickenTalk.append("Yo im a ");
        chickenTalk.append(name);
        chickenTalk.append(" b");
        return chickenTalk.toString();
    }

    public Chicken clone() {
        Chicken clonedChicken = (Chicken) super.clone();
        String chickenName = clonedChicken.getName();
        numberOfClones++;
        clonedChicken.setName(chickenName+numberOfClones);
        return clonedChicken;
    }
}

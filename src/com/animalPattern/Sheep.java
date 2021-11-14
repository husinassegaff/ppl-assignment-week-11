package com.animalPattern;

public class Sheep extends Animal {
    private int numberOfClones = 0;

    @Override
    public String greetingAnimal() {
        StringBuffer sheepTalk = new StringBuffer();
        sheepTalk.append("Sheeeezz why am i a ");
        sheepTalk.append(name);
        return sheepTalk.toString();
    }

    public Sheep clone() {
        Sheep clonedSheep = (Sheep) super.clone();
        String sheepName = clonedSheep.getName();
        numberOfClones++;
        clonedSheep.setName(sheepName+numberOfClones);
        return clonedSheep;
    }
}

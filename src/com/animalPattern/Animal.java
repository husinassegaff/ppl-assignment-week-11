package com.animalPattern;

public abstract class Animal implements Cloneable {
    protected int legsCount = 0;
    protected String name = "";

    public abstract String greetingAnimal();

    public Animal clone() {
        Animal clonedAnimal = null;
        try {
            clonedAnimal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        clonedAnimal.setName(name);
        return clonedAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

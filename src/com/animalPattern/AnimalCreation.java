package com.animalPattern;

public class AnimalCreation {
    private Animal chicken = new Chicken();
    private Animal sheep = new Sheep();

    public AnimalCreation() {
        chicken.setName("Chicken");
        sheep.setName("Sheep");
    }

    public Animal retrieveAnimal(String variety) {
        if("Chicken".equals(variety)) {
            return (Animal) chicken.clone();
        }
        if("Sheep".equals(variety)) {
            return (Animal) sheep.clone();
        }
        return null;
    }
}

package com.animalPattern;

public class AnimalClient {

  public static void main(String[] args) {
    AnimalCreation animalCreation = new AnimalCreation();
    Animal[] animalFarm = new Animal[10];

    animalFarm[0] = animalCreation.retrieveAnimal("Chicken");
    animalFarm[1] = animalCreation.retrieveAnimal("Chicken");
    animalFarm[2] = animalCreation.retrieveAnimal("Chicken");
    animalFarm[3] = animalCreation.retrieveAnimal("Chicken");
    animalFarm[4] = animalCreation.retrieveAnimal("Sheep");
    animalFarm[5] = animalCreation.retrieveAnimal("Sheep");
    animalFarm[6] = animalCreation.retrieveAnimal("Sheep");
    animalFarm[7] = animalCreation.retrieveAnimal("Sheep");
    animalFarm[8] = animalCreation.retrieveAnimal("Sheep");
    animalFarm[9] = animalCreation.retrieveAnimal("Chicken");

    for(int i=0; i<10; i++) {
      System.out.println(animalFarm[i].greetingAnimal());
    }

  }
}

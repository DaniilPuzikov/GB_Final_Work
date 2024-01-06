package JavaProject.App;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JavaProject.Classes.Animals;
import JavaProject.Classes.Camel;
import JavaProject.Classes.Cat;
import JavaProject.Classes.Dog;
import JavaProject.Classes.Donkey;
import JavaProject.Classes.Hamster;
import JavaProject.Classes.Horse;
import JavaProject.Classes.PackAnimals;
import JavaProject.Classes.Pets;

public class Program {
    List<Animals> animal_nursery;
    List<PackAnimals> pack_animals;
    List<Pets> pets;

    public Program(){
        animal_nursery=new ArrayList<>();
        pack_animals=new ArrayList<>();
        pets=new ArrayList<>();
    }

    public void addDog(String name,String gender,int age){
        Dog dog = new Dog(name, gender, age);
        animal_nursery.add(dog);
        pets.add(dog);
    }

    public void addCat(String name,String gender,int age){
        Cat cat = new Cat(name, gender, age);
        animal_nursery.add(cat);
        pets.add(cat);
    }

    public void addHamster(String name,String gender,int age){
        Hamster hamster = new Hamster(name, gender, age);
        animal_nursery.add(hamster);
        pets.add(hamster);
    }

    public void addHorse(String name,String gender,int age){
        Horse horse = new Horse(name, gender, age);
        animal_nursery.add(horse);
        pack_animals.add(horse);
    }

    public void addCamel(String name,String gender,int age){
        Camel camel = new Camel(name, gender, age);
        animal_nursery.add(camel);
        pack_animals.add(camel);
    }

    public void addDonkey(String name,String gender,int age){
        Donkey donkey = new Donkey(name, gender, age);
        animal_nursery.add(donkey);
        pack_animals.add(donkey);
    }

    public String getAllInfo(){
        return animal_nursery.toString();
    }

    public String getPetsInfo(){
        return pets.toString();
    }

    public String getPackAnimalsInfo(){
        return pack_animals.toString();
    }

    public List<Animals> getAnimalNursery(){
        return animal_nursery;
    }
}

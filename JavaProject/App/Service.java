package JavaProject.App;

import java.util.List;
import java.util.Scanner;

import JavaProject.Classes.Animals;
import JavaProject.Classes.Counter;

public class Service{
    Program prog = new Program();
    boolean start=true;
    Scanner scanner = new Scanner(System.in);
    public void work(){
        while(start){
            String choice;
            System.out.println("1.Add animal\n2.Get all info\n3.Get pets info\n4.Get pack animals info\n5.Add command\n6.End");
            choice=scanner.nextLine();
            if(choice.equals("1")){
                try(Counter counter = new Counter();){
                    System.out.println("Type of animals:\n 1.Pet\n 2.Pack animal");
                    String choiceType=scanner.nextLine();
                    if(choiceType.equals("1")){
                    System.out.println("Pets:\n 1.Cat\n 2.Dog\n 3.Hamster");
                    String choiceAnimal = scanner.nextLine();
                    if(choiceAnimal.equals("1")){
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender");
                        String gender = scanner.nextLine();
                        System.out.println("Enter age");
                        int age= scanner.nextInt();
                        if (name.isEmpty()||gender.isEmpty()||age<=0){
                            throw new RuntimeException("Some fields were filled wrong");
                        }
                        else{
                            prog.addCat(name, gender, age);
                            counter.add();
                        }
                    }
                    if(choiceAnimal.equals("2")){
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender");
                        String gender = scanner.nextLine();
                        System.out.println("Enter age");
                        int age = scanner.nextInt();
                        if (name.isEmpty()||gender.isEmpty()||age<=0){
                            throw new RuntimeException("Some fields were filled wrong");
                        }
                        else{
                            prog.addDog(name, gender, age);
                            counter.add();
                        }
                    }
                    if(choiceAnimal.equals("3")){
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender");
                        String gender = scanner.nextLine();
                        System.out.println("Enter age");
                        int age= scanner.nextInt();
                        if (name.isEmpty()||gender.isEmpty()||age<=0){
                            throw new RuntimeException("Some fields were filled wrong");
                        }
                        else{
                            prog.addHamster(name, gender, age);
                            counter.add();
                        }
                    }
                    else{
                        System.out.println("Wrong");
                    }
                }
                if(choiceType.equals("2")){
                    System.out.println("Pets:\n 1.Horse\n 2.Camel\n 3.Donkey");
                    String choiceAnimal = scanner.nextLine();
                    if(choiceAnimal.equals("1")){
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender");
                        String gender = scanner.nextLine();
                        System.out.println("Enter age");
                        int age= scanner.nextInt();
                        if (name.isEmpty()||gender.isEmpty()||age<=0){
                            throw new RuntimeException("Some fields were filled wrong");
                        }
                        else{
                            prog.addHorse(name, gender, age);
                            counter.add();
                        }
                    }
                    if(choiceAnimal.equals("2")){
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender");
                        String gender = scanner.nextLine();
                        System.out.println("Enter age");
                        int age= scanner.nextInt();
                        if (name.isEmpty()||gender.isEmpty()||age<=0){
                            throw new RuntimeException("Some fields were filled wrong");
                        }
                        else{
                            prog.addCamel(name, gender, age);
                            counter.add();
                        }
                    }
                    if(choiceAnimal.equals("3")){
                        System.out.println("Enter name");
                        String name = scanner.nextLine();
                        System.out.println("Enter gender");
                        String gender = scanner.nextLine();
                        System.out.println("Enter age");
                        int age= scanner.nextInt();
                        if (name.isEmpty()||gender.isEmpty()||age<=0){
                            throw new RuntimeException("Some fields were filled wrong");
                        }
                        else{
                            prog.addDonkey(name, gender, age);
                            counter.add();
                        }
                    }
                    else{
                        System.out.println("Wrong");
                    }
                }
                else{
                    System.out.println("Wrong");
                }
                }
                catch(Exception e){
                    System.out.println("Error");
                }
            }
            if(choice.equals("2")){
                System.out.println(prog.getAllInfo());
            }
            if(choice.equals("3")){
                System.out.println(prog.getPetsInfo());
            }
            if(choice.equals("4")){
                System.out.println(prog.getPackAnimalsInfo());
            }
            if(choice.equals("5")){
                System.out.println(prog.getAllInfo());
                System.out.println("Enter species: ");
                String species = scanner.nextLine();
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                List<Animals> animals=prog.getAnimalNursery();
                try{
                    for(int i=0;i<animals.size();i++){
                        if(animals.get(i).getSpecies().equals(species)){
                            if(animals.get(i).getName().equals(name)){
                                System.out.println("Enter command name: ");
                                animals.get(i).addCommand(scanner.nextLine());
                                break;
                            }
                            else{
                                System.out.println("Animal not found");
                            }
                        }
                        else{
                            System.out.println("Animal not found");
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Something went wrong");
                }
            }
            if(choice.equals("6")){
                System.out.println("Bye");
                start=false;
            }
            System.out.println(" ");
        } 
    }
}

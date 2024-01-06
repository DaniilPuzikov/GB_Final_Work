package JavaProject.Classes;

import java.util.ArrayList;
import java.util.List;

public class Pets implements Animals{
    protected String name;
    protected int age;
    protected String gender;
    protected String type="Pet";
    protected List<String> commands;
    public Pets(){
        commands=new ArrayList<>();
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
       this.age=age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setGender(String gender) {
        this.gender=gender;
    }

    @Override
    public String getGender() {
        return gender;
    }
    
    public String getType(){
        return type;
    }

    public void addCommand(String command){
        commands.add(command);
    }

    public String getCommands(){
        return commands.toString();
    }

    @Override
    public String getSpecies() {
        return "";
    }
}

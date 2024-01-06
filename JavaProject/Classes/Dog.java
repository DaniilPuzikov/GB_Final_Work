package JavaProject.Classes;

public class Dog extends Pets{
    private String species="Dog";

    public Dog(String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public String getSpecies(){
        return species;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(name);
        sb.append(" ");
        sb.append("Gender: ");
        sb.append(gender);
        sb.append(" ");
        sb.append("Age: ");
        sb.append(age);
        sb.append(" ");
        sb.append("Type: ");
        sb.append(type);
        sb.append(" ");
        sb.append("Species: ");
        sb.append(species);
        sb.append(" ");
        sb.append("Commands: ");
        sb.append(commands);
        sb.append("\n");
        return sb.toString();
    }
}


public abstract class Animal {
    private int weight;
    private String name;

    public Animal() {};
    public Animal(int weight, String name){
        this.weight = weight;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void eat();

    @Override
    public String toString(){
        return "animal name : " + this.name + "\n" +
                "animal weight : " + this.weight;
    }
}
public class Dog extends Animal{
    private String master;
    public Dog() {}

    public Dog(String master, String name, int weight){
        super(weight, name);
        this.master = master;
    }

    public String getMaster() {
        return master;
    }

    public String getName(){
        return super.getName();
    }

    public int getWeight(){
        return super.getWeight();
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public void setName(String name){
        super.setName(name);
    }

    public void setWeigth(int weigth){
        super.setWeight(weigth);
    }

    public void eat(){
        System.out.println("Dog eats pal");
    }




    @Override
    public String toString(){
        return "dog name : " + getName() + "\n" +
                "dog weight : " + getWeight() + "\n" +
                "dog master's name : " + this.master;
    }
}

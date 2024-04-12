public class Cat extends Animal{
    private String race;
    public Cat(String race, String name, int weigth){
        super(weigth, name);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public String getName(){
        return super.getName();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setName(String name){
        super.setName(name);
    }

    public void setWeigth(int weigth){
        super.setWeight(weigth);
    }

    public void eat(){
        System.out.println("Cat eats ronron");
    }

    @Override
    public String toString(){
        return "cat name : " + getName() + "\n" +
                "cat weight : " + getWeight() + "\n" +
                "cat race : " + this.race;
    }


}

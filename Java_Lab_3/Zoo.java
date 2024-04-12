public class Zoo {
    private Animal[] arrAnimals;
    private final int max_size = 20;
    private static int animalCount = 0;

    public Zoo(){
        arrAnimals = new Animal[max_size];
    }

    public void addAnimal(Animal animal){
        if (animalCount < 20){
            this.arrAnimals[animalCount] = animal;
            animalCount++;
        }
    }

    public String toString(){
        String zooInfo = "";
        for (int i = 0; i < this.arrAnimals.length; i++){
            if (this.arrAnimals[i] == null){
                zooInfo += "";
            }
            else{
                zooInfo += this.arrAnimals[i].toString();
            }
        }
        return zooInfo;
        }
    }
import javax.lang.model.type.NullType;

public class Main {
    public static void main(String[] args){

        MultipleOf n = new MultipleOf(55);
        int numberMultiple = 5;
        System.out.println(n.toString(numberMultiple));

        SuperiorTo s = new SuperiorTo(100);
        int numberSuperior = 99;
        System.out.println(s.toString(numberSuperior));

        IncludedInterval i = new IncludedInterval(0, 10);
        int numberInterval = 55;
        System.out.println(i.toString(numberInterval));

        Dog myDog = new Dog("steve", "doggy", 10);
        System.out.println(myDog.toString());
        // Animal myAnimal = new Animal(12, "puppy");
        // System.out.println(myAnimal.toString());
        Dog mySecondDog = new Dog("jean", "rocky", 11);
        Dog myThirdDog = new Dog("adam", "flash", 7);
        Cat myCat = new Cat("siberien", "perla", 5);
        Zoo myZoo = new Zoo();

        myZoo.addAnimal(myDog);
        myZoo.addAnimal(mySecondDog);
        myZoo.addAnimal(myThirdDog);
        myZoo.addAnimal(myCat);



        myDog.eat();
        myCat.eat();

        Animal[] animals = new Animal[5];
        animals[0] = myDog;
        animals[1] = mySecondDog;
        animals[2] = myThirdDog;
        animals[3] = myCat;
        // animals[4] = myAnimal;
        for (int j = 0; j < animals.length; j++){
            if (animals[j] == null){
                System.out.print("index " + j + " is null\n");
            }
            else {
                System.out.println(animals[j].toString());
            }
        }


        for (int k = 0; k < animals.length; k++){
            if (animals[k] == null){
                System.out.println("index " + k + " is null\n");
            }
            else {
                System.out.println("name of the animal is " + animals[k].getName());
            }
        }
        System.out.println("---------------\nThis is the zoo :\n");
        System.out.println(myZoo.toString());


    }
}

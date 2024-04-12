public class SuperiorTo implements Condition{
    private final int ref;

    public SuperiorTo(int number){
        this.ref = number;
    }

    public boolean isSuperiorTo(int number){
        if (number > this.ref){
            return verif(1);
        }
        return verif(0);
    }

    public boolean verif(int number){
        return number == 1;
    }


    public String toString(int number) {
        if (isSuperiorTo(number)) {
            return (number + " is superior to " + ref);
        }
        return (number + " is inferior to " + ref);
    }
}
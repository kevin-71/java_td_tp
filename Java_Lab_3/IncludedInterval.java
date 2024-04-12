public class IncludedInterval {
    private final int a;
    private final int b;

    public IncludedInterval(int first, int second){
        this.a = first;
        this.b = second;
    }

    public boolean checkIncludedInterval(int first, int second){
        if (first > this.a && first <= this.b && second <= this.b && second > this.a)
            return verif(1);

        return verif(0);
    }

    public boolean verif(int number){
        return number == 1;
    }

    public String toString(int number){
        if (checkIncludedInterval(this.a, this.b)){
            return number + " is included in [" + a + "," + b + "[";
        }
        return number + " is not included in [" + a + "," + b + "[";
    }
}
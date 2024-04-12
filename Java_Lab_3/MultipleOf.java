public class MultipleOf implements Condition {
    private final int n;

    public MultipleOf(int number) {
        this.n = number;
    }

    public boolean checkMultiple(int number) {
        if (this.n % number == 0) {
            return verif(1);
        }
        return verif(0);
    }

    public boolean verif(int number) {
        return number == 1;
    }

    public String toString(int number) {
        if (checkMultiple(number)) {
            return (number + " is multiple of " + n);
        }
        return (number + "is not multiple of " + n);
    }
}


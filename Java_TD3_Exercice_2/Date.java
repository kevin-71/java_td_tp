//source : myself from TP1

public class Date {
    //Attributes
    int day;
    int month;
    int year;

    Date() {
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return " " + this.day + "/" + this.month + "/" + this.year;
    }
}
public class Employee extends Person {
    private double salary;
    private static int nbEmployee;

    public Employee(){
        nbEmployee++;
    }
    public Employee(String lastName, String firstName, Date dateOfBirth, double salary){
        super(lastName, firstName, dateOfBirth);
        nbEmployee++;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() +
                "salary : " + this.salary;
    }
}

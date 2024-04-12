public class Manager extends Employee{
    private String service;

    private static int nbManager;

    public Manager(){
        nbManager++;
    }
    public Manager(String lastName, String firstName, Date dateOfBirth, double salary, String service){
        super(lastName, firstName, dateOfBirth, salary);
        nbManager++;
        this.service = service;
    }

    public String getService(){
        return service;
    }

    public void setService(String service){
        this.service = service;
    }

    @Override
    public String toString(){
        return super.toString() + "\n service : " + service;
    }
}

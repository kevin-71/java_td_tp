public class Director extends Manager{
    private String company;
    private static int nbDirector;

    public Director(){
        nbDirector++;
    }
    public Director(String lastName, String firstName, Date dateOfBirth, double salary, String service, String company){
        super(lastName, firstName, dateOfBirth, salary, service);
        nbDirector++;
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    @Override
    public String toString(){
        return super.toString() + "\n company : " + company;
    }
}

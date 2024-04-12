public class Person {
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private static int nbPersons;

    public Person() {
        nbPersons++;
    };

    public Person(String lastName, String firstName, Date dateOfBirth){
        nbPersons++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString(){
        return "person first name : " + this.firstName + "\n" +
                "last name : " + this.lastName + "\n" +
                "date of birth" + this.dateOfBirth;
    }
}

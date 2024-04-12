import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Point p = new Point();
        p.setX(5);
        p.setY(4);
        System.out.println(p.toString());

        GeometricFigure g = new GeometricFigure(22, 46);
        System.out.println(g.toString());

        Rectangle myRect = new Rectangle(4,5,6.5,7.5);
        System.out.println(myRect.toString());

        // part 2

        Date personBirthDate = new Date(21, 11, 2021);
        Person myPerson = new Person("jean", "adam", new Date(21, 11, 2021));
        System.out.println(myPerson.toString());

        // to create a table of 5 employee, 2 managers and 1 director, we implement a table of type "Person"

        Person[] persons = new Person[8];
        persons[0] = new Employee("alex", "durant", new Date(14, 5, 2001), 1254.2);
        persons[1] = new Employee("pierre", "dupont", new Date(11, 4, 1994), 1234.1);
        persons[2] = new Employee("alexandre", "ref", new Date(24, 12, 1987), 2451.1);
        persons[3] = new Employee("lucas", "blanc", new Date(30, 6, 2015), 2452.2);
        persons[4] = new Employee("chris", "lis", new Date(7, 8, 2000),1365.1);
        persons[5] = new Manager("loris", "pero", new Date(13, 7, 2001), 4541.9, "bakery");
        persons[6] = new Manager("louis", "truc", new Date(30, 4, 2001), 3548.7, "drinks");
        persons[7] = new Director("elon", "musk", new Date(17, 5, 1992), 15462545.1, "all", "elon's bakery");

        for (Person person : persons){
            if (person instanceof Employee && !(person instanceof Manager) && !(person instanceof Director)){  // displays only Employee
                System.out.println(person.toString());
            }
        }
    }
}

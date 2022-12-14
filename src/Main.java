import Service.ServiceImpl.Person;
import Service.ServiceImpl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person>people=new ArrayList<>();

        System.out.println("""
                1 -> to create person
                2 -> to 
                """);

        PersonServiceImpl personServiceImpl = new PersonServiceImpl();
        System.out.println(personServiceImpl.createPerson());
        System.out.println(personServiceImpl.getAllPeople());
    }
}
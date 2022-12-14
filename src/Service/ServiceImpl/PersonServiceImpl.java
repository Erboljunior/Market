package Service.ServiceImpl;

import Service.PersonService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    List<Person>people=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public String createPerson() {
        System.out.println("name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("phone number: ");
        String phoneNumber=new Scanner(System.in).nextLine();
        System.out.println("How much money do you have: ");
        BigDecimal bigDecimal = new BigDecimal(new Scanner(System.in).nextInt());
        Person person = new Person(name,phoneNumber,bigDecimal);
        people.add(person);
        return "Successfully created";
    }

    @Override
    public List<Person> getAllPeople() {
        return people;
    }
}

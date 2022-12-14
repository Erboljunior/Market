package Service;

import Service.ServiceImpl.Person;

import java.util.List;

public interface PersonService {
    String createPerson();
    List<Person>getAllPeople();
}

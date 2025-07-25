package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PeopleOrder{
    ArrayList<Person> people = new ArrayList<>();

    public PeopleOrder() {
    }

    public void addPerson(String name, int age, int height)
    {
        Person person = new Person(name, age, height);
        people.add(person);
        System.out.println(person + "was added to the list. \n");
    }

    public void orderByAge() {
        Collections.sort(people);
        System.out.println(String.format("===== People by age ===== \n" +
                people.toString() + "========================="));
    }

    public void orderByHeight() {
        people.sort(new ByHeight());
    }

    @Override
    public String toString() {
        return "======= People List =======\n" + people +
                "=========== END ===========";
    }
}

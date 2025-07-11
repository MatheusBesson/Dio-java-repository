package Comparable;

import java.util.Comparator;

public class ByHeight implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getHeight() < p2.getHeight()) {
            return -1;
        }
        if (p1.getHeight() > p2.getHeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}


import Comparable.PeopleOrder;

public class Main {
    public static void main(String[] args) {
        PeopleOrder peopleOrder = new PeopleOrder();

        peopleOrder.addPerson("Joshua", 31, 181);
        peopleOrder.addPerson("Gilbert", 76, 174);
        peopleOrder.addPerson("Nadia", 28, 153);
        peopleOrder.addPerson("Leopold", 42, 178);
        peopleOrder.addPerson("Mick", 26, 186);

        System.out.println(peopleOrder.toString());

        peopleOrder.orderByAge();
        System.out.println(peopleOrder.toString());
        peopleOrder.orderByHeight();
        System.out.println(peopleOrder.toString());


    }
}
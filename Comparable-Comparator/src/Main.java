
import Comparable.PeopleOrder;
import Comparator.NumberOrder;

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


        //-------------- Number ordering challenge ---------------

        NumberOrder numberOrder = new NumberOrder();
        numberOrder.addNumber(1);
        numberOrder.addNumber(4);
        numberOrder.addNumber(2);
        numberOrder.addNumber(7);
        numberOrder.addNumber(9);
        numberOrder.addNumber(3);
        numberOrder.addNumber(6);
        numberOrder.addNumber(8);
        numberOrder.addNumber(5);
        numberOrder.addNumber(0);

        System.out.println(numberOrder.toString());
        numberOrder.ascendingOrder();
        System.out.println(numberOrder.toString());
        numberOrder.descendingOrder();
        System.out.println(numberOrder.toString());

    }
}
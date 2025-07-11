package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberOrder{
    ArrayList<Number> numList = new ArrayList<>();

    public void addNumber(int num) {
        numList.add(new Number(num));
        System.out.println("Number: " + num + " Added to the list.");
    }

    public void ascendingOrder () {
        Collections.sort(numList);
    }
    public void descendingOrder() {
        Collections.sort(numList, Comparator.reverseOrder());
    }

    @Override
    public String toString() {
        return "NumberOrder{" +
                "numList=" + numList +
                '}';
    }
}

import java.util.ArrayList;

public class NumbersSum {
    ArrayList<Integer> sumList = new ArrayList<>();

    public void addNum(int num) {
        sumList.add(num);
        System.out.println("Number " + num + "was added to the list. \n");
    }

    public void sumCalc() {
        int sumResult = 0;
        for (int i = 0; i < sumList.size(); i++) {
            sumResult += sumList.get(i).intValue();
        }
        System.out.println("The sum result is " + sumResult + "\n");
    }

    public void findBigNum() {
        int bigNum = 0;
        for (int i = 0; i < sumList.size(); i++) {
            if (sumList.get(i).intValue() > bigNum) {
                bigNum = sumList.get(i).intValue();
            }
        }
        System.out.println("The biggest number is " + bigNum + "\n");
    }

    public void smallNum() {
        int smallNum = Integer.MAX_VALUE;
        for (int i = 0; i < sumList.size(); i++) {
            if (sumList.get(i).intValue() < smallNum) {
                smallNum = sumList.get(i).intValue();
            }
        }
        System.out.println("The smallest number is " + smallNum + "\n");
    }

    public void showNumbers() {
        String msg = "";
        for (int i = 0; i < sumList.size(); i++) {
            msg += String.format("==========\n Position %d:  %d \n ==========", i, sumList.get(i).intValue());
        }
        System.out.println(msg);
    }
}

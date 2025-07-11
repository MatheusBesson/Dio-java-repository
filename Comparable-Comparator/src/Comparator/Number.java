package Comparator;

public class Number implements Comparable<Number>{
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Number another) {
        return Integer.compare(this.value, another.value);
    }
        @Override
    public String toString() {
        return String.valueOf(value);
    }
}

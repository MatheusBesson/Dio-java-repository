package Comparable;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.getAge());
    }



    @Override
    public String toString() {
        return "----------Person----------\n " +
                "name: '" + name + "\n" +
                "age: " + age + "\n" +
                "height: " + height + "\n";
    }
}

import Exceptions.ImmutableException;

public class ImmutableNumber<Integer> {
    private int number;
    private boolean blocked = false;

    public ImmutableNumber(int number, boolean blocked) {
        this.number = number;
        this.blocked = blocked;
    }

    public void setNumber(int newNumber) throws ImmutableException {
        if (!blocked) {
            this.number = newNumber;
            System.out.println("Number " + newNumber + " positioned.");
        } else {
            throw new ImmutableException("[ERROR] You can't alter this number!");
        }
    }
}

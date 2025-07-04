

public final class FamilyTicket extends CinemaTicket {

    // extra properties
    private int custumers;
    private double discount;

    // constructors --------------------
    public FamilyTicket(int costumers, double value, String movieName, boolean isDub) {
        super(value, movieName, isDub);
        this.custumers = costumers;
        if (this.custumers > 3) {
            double newTicket = value - (value * (5.0 / 100));
            this.value = newTicket;
            this.discount = this.value - newTicket;
        }
    }

    // getters and setters
    public double getDiscount() {
        return discount;
    }

    // override methods
    @Override
    public String realTicketValue() {
        if (this.custumers > 3) {
            double originalTicketValue = getValue() + (getValue() * (5.00 / 100));
            double discount = originalTicketValue - getValue();
            string = String.format("Full price ticket is U$%s. \n" +
                    "Discount made: U$%s.\n" +
                    "New price: U$%s.", originalTicketValue, discount, getValue());
        } else {
            string = String.format("Ticket price is U$%s. \n", getValue());
        }
        return string;
    }

}

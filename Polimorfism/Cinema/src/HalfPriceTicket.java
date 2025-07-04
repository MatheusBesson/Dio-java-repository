

public final class HalfPriceTicket extends CinemaTicket{

    // no extra properties

    // constructors -----------------------
    public HalfPriceTicket(double value, String movieName, boolean isDub) {
        super(value, movieName, isDub);
        this.value = value / 2;
    }

    // override methods
    @Override
    public String realTicketValue () {
        double originalTicketValue = getValue() * 2;
        double discount = originalTicketValue - getValue();
        string = String.format("Full price ticket is U$%s. \n" +
                "Discount made: U$%s.\n" +
                "New price: U$%s.", originalTicketValue, discount, getValue() );
        return string ;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}

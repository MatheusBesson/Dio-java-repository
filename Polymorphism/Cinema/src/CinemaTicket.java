

public sealed class CinemaTicket permits HalfPriceTicket, FamilyTicket {

    // properties -----------------------------
    protected double value;
    protected String movieName;
    protected boolean isDub;

    String string = "";

    // constructors ---------------------------------
    public CinemaTicket(double value, String movieName, boolean isDub) {
        this.value = value;
        this.movieName = movieName;
        this.isDub = isDub;
    }

    // Getters and setters ---------------------------


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isDub() {
        return isDub;
    }

    public void setDub(boolean dub) {
        isDub = dub;
    }

    // methods
    public String realTicketValue() {
        string = String.format("The full price ticket is U$%s.\n", getValue());
        return string;
    }


    @Override
    public String toString() {
        return String.format("{--------%s------- \n" +
                "value = U$" + getValue() +
                "\nmovieName = " + getMovieName() +
                "\nisDub = " + isDub() +
                "\n------------------------}\n", this.getClass().getSimpleName());
    }
}

public class App {
        public static void main (String []args) {

            CinemaTicket cinemaTicket = new CinemaTicket(50, "Avangers", false);

            System.out.println(cinemaTicket.toString());
            System.out.println(cinemaTicket.realTicketValue());

            HalfPriceTicket halfPriceTicket = new HalfPriceTicket(50, "Avangers", false);

            System.out.println(halfPriceTicket.toString());
            System.out.println(halfPriceTicket.realTicketValue());

            FamilyTicket familyTicket = new FamilyTicket(4,150, "Avangers", false);

            System.out.println(familyTicket.toString());
            System.out.println(familyTicket.realTicketValue());
        }
}

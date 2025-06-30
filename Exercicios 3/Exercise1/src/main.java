public class main {
    public static void main(String[] args) {

        // Client
        Client client1 = new Client(false, 0, 500, "Jeff", 30);
        System.out.println(client1.toString());
        System.out.println("----------------");
        System.out.println(client1.getBalanceConsult());
        System.out.println(client1.getOverdraftConsult());
        System.out.println("----------------");
        System.out.println(client1.deposit(500));
        System.out.println(client1.getBalanceConsult());
        System.out.println(client1.withdraw(323));
        System.out.println("--------balance--------");
        System.out.println(client1.getBalanceConsult());

        System.out.println(client1.toString());


    }
}

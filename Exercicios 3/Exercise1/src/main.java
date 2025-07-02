public class main {
    public static void main(String[] args) {

        // Client
        Client client1 = new Client(0, "Jeff", 30);

        // client full properties
        System.out.println(client1.toString());

        // balance consult
      /*  System.out.println(client1.getBalanceConsult());
        System.out.println("---------------------------------"); */

        // Overdraft consult
       // System.out.println(client1.getOverdraftConsult());
      //  System.out.println("---------------------------------");

        // depositing money
     /*   System.out.println(client1.deposit(0));
        System.out.println("---------------------------------"); */
      //  client1.setBalance(0);
        // withdrawing money
      //  System.out.println(client1.withdraw(0));
      //  System.out.println("---------Balance Consult---------");
      //  System.out.println(client1.getBalanceConsult());
/*
        // generating and paying boleto
        System.out.println("---------Generate Boleto---------");
        System.out.println(BankAccount.generateBoleto());
        System.out.println("------------- Paying Boleto-------------");
        System.out.println(client1.payBoleto());
        System.out.println("---------Balance Consult---------");
        System.out.println(client1.getBalanceConsult());
        System.out.println("---------------------------------"); */

     //   System.out.println(client1.boletoInterest(client1.isOverdrafting()));

        // verifying if the client is using Overdrafted money
    //    System.out.println(client1.getOverdraftConsult());
     //   System.out.println("---------------------------------");

        System.out.println("------------Teste de boletos-------------");
        System.out.println(BankAccount.generateBoleto());
        System.out.println(client1.payBoleto());
        System.out.println(client1.boletoInterest(client1.isOverdrafting()));


    }
}

package VersaoBoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);;

        try {
            System.out.println("Enter account data");
            System.out.println("Number:");
            int number = sc.nextInt();
            System.out.println("Holder:");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.println("Initial balance:");
            double balance = sc.nextDouble();
            System.out.println("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account x = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Enter amount for withdraw:");
            Double amount = sc.nextDouble();

            x.withdraw(amount);

            System.out.println("New balance: " + x.getBalance());
        }
        catch (AccountException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}

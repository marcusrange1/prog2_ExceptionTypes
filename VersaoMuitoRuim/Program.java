package VersaoMuitoRuim;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

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

        Account x = new Account(number,holder,balance,withdrawLimit);

        System.out.println("Enter amount for withdraw:");
        Double amount = sc.nextDouble();

        if(amount>balance) {
            System.out.println("Withdraw error: Not enough balance");
        }
        else if (amount > x.getWithdrawLimit()) {
            System.out.println("Withdraw error: The amount exceeds withdraw limit");
        } else {
            x.withdraw(amount);
            System.out.println("New balance: " + x.getBalance());
        }
    }
}

package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts
 */

public class Bank {

    public static void main(String[] args) {

        // creates new instance of Bank class
        Bank bank = new Bank();

        // calls the run method in the bank class
        bank.run();


    }

    /**
     * Runs the program by initializing and managing bank account and customers.
     */
    public void run() {

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        // get the next token/word

        String name = scanner.next();

        System.out.println("Hello, " + name + "! We are creating account for you");

        // create customer with given name
        Customer customer = new Customer(name);

        System.out.println("Enter your address: ");
        String address = scanner.next();

        // set address
        customer.setAddress(address);

        // create bank accounts
        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingsAccount = new BankAccount("savings", customer);

        // print customer info
        System.out.println();
        System.out.println("Customer info: ");
        System.out.println(checkingAccount.getCustomerInfo());


    }
}

package Models;
import Interfaces.IBank;
import java.util.Currency;

public class Santander implements IBank {
    public String name;
    public String manager;
    public String country;
    public String address;
    public double balance;
    public Currency currency;

    public Santander(String name, String manager, String country, String address, double balance, String currencyCode) {
        this.name = name;
        this.manager = manager;
        this.country = country;
        this.address = address;
        this.balance = balance;
        this.currency = Currency.getInstance(currencyCode);
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return false;
        }
        balance -= amount;
        System.out.println("Amount successfully withdrawn.");
        return true;
    }
}

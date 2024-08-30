package Models;
import Interfaces.IBank;
import Interfaces.IInsuranceCompany;
import java.util.Currency;
import java.util.Date;

public class JPMorgan implements IBank, IInsuranceCompany {
    public String name;
    public String manager;
    public String country;
    public String address;
    public double balance;
    public Currency currency;

    public JPMorgan(String name, String manager, String country, String address, double balance, String currencyCode) {
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
        balance -= amount + (amount * 0.01);
        System.out.println("Amount successfully withdrawn.");
        return true;
    }

    @Override
    public boolean createInsurancePolicy(String name, int age) {
        System.out.println("Life insurance successfully processed!");
        return true;
    }

    @Override
    public boolean createInsurancePolicy(String carModel, int carID, int manufacturedYear) {
        if (manufacturedYear < 2000) {
            System.out.println("Unauthorized insurance for the car manufactured in the year " + manufacturedYear + ".");
            return false;
        }
        System.out.println("Car insurance successfully completed.");
        return true;
    }

    @Override
    public boolean createInsurancePolicy(String passengerName, String origin, String destination, Date departureDate, Date returnDate) {
        System.out.println("Travel insurance successfully processed!");
        return true;
    }
}

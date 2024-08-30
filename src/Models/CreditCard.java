package Models;
import Interfaces.IBank;
import java.util.Random;

public class CreditCard {
    public String ownerName;
    public IBank bank;
    public double monthlyIncome;
    public double limit;
    public String number;
    public double balance;

    public CreditCard(String ownerName, IBank bank, double monthlyIncome) {
        this.ownerName = ownerName;
        this.bank = bank;
        this.monthlyIncome = monthlyIncome;
        this.limit = grantCreditLimit(monthlyIncome);
        this.number = generateCreditCardNumber();
        this.balance = 0;
    }

    public String generateCreditCardNumber() {
        Random random = new Random();
        StringBuilder creditCardNumber = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10);
            creditCardNumber.append(digit);
        }

        return creditCardNumber.toString();
    }

    public double grantCreditLimit(double monthlyIncome) {
        return monthlyIncome * 3;
    }
}

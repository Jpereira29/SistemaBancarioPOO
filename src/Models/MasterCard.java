package Models;
import Interfaces.IBank;
import java.util.Random;

public class MasterCard extends CreditCard {
    public MasterCard(String ownerName, IBank bank, double monthlyIncome) {
        super(ownerName, bank, monthlyIncome);
    }

    @Override
    public String generateCreditCardNumber() {
        Random random = new Random();
        StringBuilder creditCardNumber = new StringBuilder();

        creditCardNumber.append(5);

        for (int i = 0; i < 15; i++) {
            int digit = random.nextInt(10);
            creditCardNumber.append(digit);
        }

        return creditCardNumber.toString();
    }

    @Override
    public double grantCreditLimit(double monthlyIncome) {
        return monthlyIncome * 2.5;
    }
}

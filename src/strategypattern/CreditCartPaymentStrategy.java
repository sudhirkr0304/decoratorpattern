package strategypattern;

public class CreditCartPaymentStrategy implements PaymentStrategy {

    String name;
    String cardnumber;
    int cvv;
    String dateOfExpiry;

    public CreditCartPaymentStrategy(String name, String cardnumber, int cvv, String dateOfExpiry) {
        this.name = name;
        this.cardnumber = cardnumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {

        System.out.println(amount + " amount is paid by credit card");

    }

}

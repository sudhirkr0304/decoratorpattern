package strategypattern;

public class PaypalPaymentStrategy implements PaymentStrategy{

    String emailId;
    String password;

    

    public PaypalPaymentStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }



    @Override
    public void pay(int amount) {
        
        System.out.println(amount + "amount is paid by paypal");
    }
    
}

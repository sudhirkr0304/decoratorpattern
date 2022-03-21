package strategypattern;

public class ShoppingCartTest {

    public static void main(String[] args) {
        
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new Item("coke" , 10));
        shoppingCart.addItem(new Item("pepsi" , 20));

        shoppingCart.pay(new PaypalPaymentStrategy("sss", "sss"));
    }
    
}

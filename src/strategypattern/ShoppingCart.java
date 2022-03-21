package strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    void addItem(Item item) {
        items.add(item);
    }

    void removeItem(Item item) {
        items.remove(item);
    }

    int getTotalAmount() {
        int totalAmount = 0;
        for(Item item : items) {
            totalAmount += item.amount;
        }
        return totalAmount;
    }

    void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(getTotalAmount());
    }
    
}

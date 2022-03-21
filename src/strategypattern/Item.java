package strategypattern;

public class Item {

    String itemCode;
    int amount;
    public Item(String itemCode, int amount) {
        this.itemCode = itemCode;
        this.amount = amount;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
}

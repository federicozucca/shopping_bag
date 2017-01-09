package shopping_basket;

public class Item {

    String type;
    double price;
    boolean discount;

    public Item(String type, double price, boolean discount){
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
      }

    public boolean hasDiscount() {
      return this.discount;
    }




}
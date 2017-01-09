package shopping_basket;

public class Item {

    String type;
    int price;
    boolean discount;

    public Item(String type, int price, boolean discount){
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
    
    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
      }

    public boolean hasDiscount() {
      return this.discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
      }




}
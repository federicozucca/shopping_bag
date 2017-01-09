package shopping_basket;

import java.util.ArrayList;

public class ShoppingBasket {

  public ArrayList<Item> items;
  public double total;


  public ShoppingBasket() {
    this.items = new ArrayList<Item>();
    this.total = 0;

  }

  public int itemsTotalNumber(){
      return items.size();
  }

  public void addAnItemToShoppingBasket(Item item){
    items.add(item);
  }

  public void removeAnItemFromShoppingBasket(Item item){
    items.remove(item);
  }

  public void canEmptyShoppingBag(){
    items.clear();
    }

  public int getValue() {
    int total = 0;   
    for (Item item : items){
      total += item.getPrice();
    }
    return total;
  }


}

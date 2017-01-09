package shopping_basket;

import java.util.ArrayList;

public class ShoppingBasket {

  public ArrayList<Item> items;

  public ShoppingBasket() {
    this.items = new ArrayList<Item>();
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
  


}

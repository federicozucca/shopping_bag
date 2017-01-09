import shopping_basket.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket;

    @Before
    public void before() {
      shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void shoppingBasketCanGetAnItem(){
    Item item = new Item("Pen", 1.2);
    shoppingBasket.addAnItemToShoppingBasket(item);
    assertEquals(1, shoppingBasket.itemsTotalNumber());
    }

    @Test
    public void shoppingBasketCanRemoveAnItem(){
    Item item1 = new Item("Pen", 1.2);
    Item item2 = new Item("Paper", 2.5);
    shoppingBasket.addAnItemToShoppingBasket(item1);
    shoppingBasket.addAnItemToShoppingBasket(item2);
    assertEquals(2, shoppingBasket.itemsTotalNumber());
    shoppingBasket.removeAnItemFromShoppingBasket(item2);
    assertEquals(1, shoppingBasket.itemsTotalNumber());
    }

    @Test
    public void shoppingBasketCanBeEmpty(){
    assertEquals(0, shoppingBasket.itemsTotalNumber());
    Item item1 = new Item("Pen", 1.2);
    Item item2 = new Item("Paper", 2.5);
    shoppingBasket.addAnItemToShoppingBasket(item1);
    shoppingBasket.addAnItemToShoppingBasket(item2);
    assertEquals(2, shoppingBasket.itemsTotalNumber());
    shoppingBasket.canEmptyShoppingBag();
    assertEquals(0, shoppingBasket.itemsTotalNumber());
    }

}
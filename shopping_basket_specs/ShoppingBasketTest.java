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
}
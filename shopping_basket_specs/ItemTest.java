import shopping_basket.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
  Item pen;
  Item paper;

  @Before
  public void before() {
  pen = new Item("Pen", 1.2, true);
  paper = new Item("Paper", 1.8, false);
  }

  @Test
  public void canGetType() {
   assertEquals("Pen", pen.getType());
  }

 @Test
 public void canHaveDiscount() {
  assertEquals(true, pen.hasDiscount());
 }

 @Test
 public void cannotHaveDiscount() {
   assertEquals(false, paper.hasDiscount());
 }
}
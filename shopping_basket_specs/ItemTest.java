import shopping_basket.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
  Item pen;
  Item paper;

  @Before
  public void before() {
  pen = new Item("Pen", 1, true);
  paper = new Item("Paper", 2, false);
  }

  @Test
  public void canGetType() {
   assertEquals("Pen", pen.getType());
  }

  @Test
  public void canSetType() {
    pen.setType("Blue Pen");
   assertEquals("Blue Pen", pen.getType());
  }

  @Test
  public void canGetPrice() {
    assertEquals(2, paper.getPrice());
  } 

  @Test
  public void canSetPrice() {
    paper.setPrice(3);
    assertEquals(3, paper.getPrice());
  }

 @Test
 public void canHaveDiscount() {
  assertEquals(true, pen.hasDiscount());
 }

 @Test
 public void cannotHaveDiscount() {
   assertEquals(false, paper.hasDiscount());
 }

 @Test
 public void canSetDiscount() {
   paper.setDiscount(true);
   assertEquals(true, paper.hasDiscount());
 }
}
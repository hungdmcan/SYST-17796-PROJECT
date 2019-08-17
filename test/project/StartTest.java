/*
 * Manh Hung Dao - Web Programming
 * Student ID: 991557299
 * Sheridan - Spring/Summer Semester
 */
package project;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author daomanhhung
 */
public class StartTest
{

   public StartTest ()
   {
   }


   /**
    * Test of main method, of class Start.
    */


   /**
    * Test of hasBlackJack method, of class Start.
    */
   @Test
   public void testHasBlackJackGood ()
   {
      System.out.println("hasBlackJack");
      int handValue = 21;
      boolean expResult = true;
      boolean result = Start.hasBlackJack(handValue);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   @Test
   public void testHasBlackJackBad ()
   {
      System.out.println("hasBlackJack");
      int handValue = 20;
      boolean expResult = false;
      boolean result = Start.hasBlackJack(handValue);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   /**
    * Test of calcHandValue method, of class Start.
    */
//   @Test
//   public void testCalcHandValue ()
//   {
//      System.out.println("calcHandValue");
//      List<Card> hand = null;
//      int expResult = 0;
//      int result = Start.calcHandValue(hand);
//      assertEquals(expResult, result);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }



   /**
    * Test of Hit method, of class Start.
    */

   /**
    * Test of isHitorStand method, of class Start.
    */
   @Test
   public void testIsHitorStandGood ()
   {
      System.out.println("isHitorStand");
      String hitter = "hit";
      boolean expResult = true;
      boolean result = Start.isHitorStand(hitter);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   @Test
   public void testIsHitorStandBad ()
   {
      System.out.println("isHitorStand");
      String hitter = "stand";
      boolean expResult = true;
      boolean result = Start.isHitorStand(hitter);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   /**
    * Test of checkBust method, of class Start.
    */
   @Test
   public void testCheckBustBoundary ()
   {
      System.out.println("checkBust");
      int handvalue = 21;
      boolean expResult = false;
      boolean result = Start.checkBust(handvalue);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   @Test
   public void testCheckBustGood ()
   {
      System.out.println("checkBust");
      int handvalue = 25;
      boolean expResult = true;
      boolean result = Start.checkBust(handvalue);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   @Test
   public void testCheckBustBad ()
   {
      System.out.println("checkBust");
      int handvalue = 0;
      boolean expResult = false;
      boolean result = Start.checkBust(handvalue);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of isyesorno method, of class Start.
    */
   @Test
   public void testIsyesornoBoundary ()
   {
      System.out.println("isyesorno");
      String answer = "no";
      boolean expResult = true;
      boolean result = Start.isyesorno(answer);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   @Test
   public void testIsyesornoGood ()
   {
      System.out.println("isyesorno");
      String answer = "yes";
      boolean expResult = true;
      boolean result = Start.isyesorno(answer);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   @Test
   public void testIsyesornoBad ()
   {
      System.out.println("isyesorno");
      String answer = "blah";
      boolean expResult = false;
      boolean result = Start.isyesorno(answer);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of fivecardtrick method, of class Start.
    */


}

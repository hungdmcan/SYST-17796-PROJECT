package project;

import java.util.*;
/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author megha,2019
 */
public class GroupOfCards implements ICard
{

   private static int size = 52;
   /**
    * The group of cards, stored in an ArrayList
    */
   private ArrayList<Card> deck;
   private CardGames gameName;
   private int attribute;

   public int getSize ()
   {
      return this.size;
   }

   public void setSize (int size)
   {
      this.size = size;
   }

   /**
    * the size of the grouping
    *
    * @param givenSize
    */
   public GroupOfCards ()
   {
      deck = new ArrayList<Card>();
      for (int i = 0; i < 4; i++) {
         for (int j = 1; j <= 13; j++) {
            deck.add(new Card(i, j));
         }
         // TODO - implement GroupOfCards.GroupOfCards

      }
   }

   /**
    * A method that will get the group of cards as an ArrayList
    *
    * @return the group of cards.
    */
//   private ArrayList<Card> showCards ()
//   {
//      // TODO - implement GroupOfCards.showCards
//      throw new UnsupportedOperationException();
//   }

   public void shuffle ()
   {
      Random random = new Random();
      Card temp;
      for (int i = 0; i < 200; i++) {
         int index1 = random.nextInt(deck.size() - 1);
         int index2 = random.nextInt(deck.size() - 1);
         temp = deck.get(index2);
         deck.set(index2, deck.get(index1));
         deck.set(index1, temp);
      }
   }

   public Card drawCard ()
   {
      return deck.remove(0);
   }
}

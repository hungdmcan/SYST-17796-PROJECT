package project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author megha,2019
 */
public abstract class Player implements IPlayer
{

   private String playerID;
   private String name;

   public Player ()
   {
   }

   public Player (String name)
   {
      // TODO - implement Player.Player
      throw new UnsupportedOperationException();
   }

   public String getPlayerID ()
   {
      return this.playerID;
   }

   public void setPlayerID (String playerID)
   {
      this.playerID = playerID;
   }

   /**
    * A constructor that allows you to set the player's unique ID
    *
    * @param name the unique ID to assign to this player.
    */


   /**
    * The method to be instantiated when you subclass the Player class
    * with your specific type of Player and filled in with logic to play your game.
    */
   public void play ()
   {

   }

   ;

   @Override
   public void drawCard ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public int calcHandValue ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public boolean hasBlackJack ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void hit ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public double betCash ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public double pushCash ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void win ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void lose ()
   {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   /**
    * @return the name
    */
   public String getName ()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName (String name)
   {
      this.name = name;
   }

}

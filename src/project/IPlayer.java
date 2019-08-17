package project;

public interface IPlayer
{

   void drawCard ();

   void showCards ();

   int calcHandValue ();

   boolean hasBlackJack ();

   void hit ();

   double betCash ();

   double pushCash ();

   void win ();

   void lose ();

}

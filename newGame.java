public class newGame
{ // now open
  public newGame(String game)
  {
    doDeath(game);
  }

  public void doDeath(String game)
  {
    String newGame = game;
    try
    {
      newGame = game.substring(2, 3) + game.substring(0, 2) + " " + game.substring(4, 9);
      System.out.println(newGame);
    }
    catch(NumberFormatException e){System.out.println("Error, improper code format!");}
  }
}

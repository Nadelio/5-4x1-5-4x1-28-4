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
      newGame = game.substring(3, 4) + game.substring(0, 3) + game.substring(4, -1);
      System.out.println(newGame);
    }
    catch(NumberFormatException e){System.out.println("Error, improper code format!");}
  }
}

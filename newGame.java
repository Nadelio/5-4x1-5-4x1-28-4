public class newGame
{ // now open
  public newGame(String game)
  {
    doDeath(game);
  }

  public void doDeath(String game)
  {
    String newGame = game;
    if(parseInt(game.substring(0, 4)) >= 0 || parseInt(game.substring(0,4)) <= 0)
    {
      System.out.println("Error, improper code format!");
    }
    else
    {
      newGame = game.substring(3, 4) + game.substring(0, 3) + game.substring(4, -1);
      System.out.println(newGame);
    }
  }
}

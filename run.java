import java.util.Scanner;

public class run
{
  public static void main(String [] args)
  {
    try (Scanner p = new Scanner(System.in))
    {
      String input = p.nextLine();
      new newGame(input);
    }
  }
}

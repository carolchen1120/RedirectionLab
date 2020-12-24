import java.util.Scanner;
import java.util.Character;

public class MakeStars{
  Scanner sc = new Scanner(System.in);
  String line = sc.nextLine();
  Scanner lineSc = new Scanner(line);
  String ans = "";
  char val = '';
  String white = "";
  boolean whiteSpace = false;

  while (lineSc.hasNext()) {
    val = lineSc.next();
    if (!Character.isWhitespace(val) && whiteSpace == false)  {
      ans += "*";
    } else if (!Character.isWhitespace(val) && whiteSpace == true){
      ans += " *";
      whiteSpace = false;
    } else if (Character.isWhitespace(val)){
      whiteSpace = true;
    }
  }

}

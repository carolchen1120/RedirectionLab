public class PigLatin{
  public static String pigLatinSimple(String s){
    String answer = "";
    String first = s.substring(0,1);
    if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
      answer += s;
      answer += "hay";
    } else {
      answer += s.substring(1,s.length());
      answer += first;
      answer += "ay";
    }
    return answer;
  }
}

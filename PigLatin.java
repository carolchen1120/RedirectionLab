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

  public static String pigLatin(String s){
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String answer = "";
    String first = s.substring(0, 2);
    String one = s.substring(0, 1);
    boolean start = false;

    for (int i = 0; i < digraphs.size(); i++) {
      if (first.equals(digraphs[i])) {
        start = true;
        break;
      }
    }

    if (start) {
      answer = s.substring(2, s.length()) + first + "ay";
    } else if (one.equals("a") || one.equals("e") || one.equals("i") || one.equals("o") || one.equals("u")) {
      answer = s + "hay";
    } else {
      answer = s.substring(1, s.length()) + "ay";
    }
    
    return answer;
  }
}

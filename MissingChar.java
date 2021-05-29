public class MissingChar {
public static void main(String[] args) {

  missingChar("Robocop", 3);

  //receive command line argument if available
  if(args.length>=2){
    missingChar(args[0], Integer.parseInt(args[1]));
  }
}

private static void missingChar(String str, int n) {
String Rob = str.substring(0, n);
String Cop = str.substring(n + 1);
System.out.println(Rob + Cop);

}
}

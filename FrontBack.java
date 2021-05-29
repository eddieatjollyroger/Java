public class FrontBack {
public static void main(String[] args) {

    frontBack("heisenberg");

    //receive command line argument if available
    if(args.length>0){
      frontBack(args[0]);
    }
}

private static void frontBack(String str) {
	char target1 = str.charAt(0);
	char target2 = str.charAt(str.length() - 1);
	String swapped = str.substring(1, str.length() - 1);
		System.out.print(target2 + swapped + target1 + "\n");

}
}

public class NotString{
public static void main(String[] args) {

    notString("semicolon");
    notString("not semicolon");

    //receive command line argument if available
    if(args.length>0){
      notString(args[0]);
    }

}

private static void notString(String str) {
	String search = "not ";
		if (str.contains(search)) {
			System.out.println("\t" + str);
}
		else {
			System.out.print("\t" + search + " " + str);
}
}
}

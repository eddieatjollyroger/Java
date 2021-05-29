public class StringManipulations {
public static void main(String[] args){

	StringManipulations("http://www.academiadecodigo.org");

}
private static void StringManipulations(String str) {
	String barra = "/";
	int indexBarra = str.lastIndexOf(barra);
	String domain = str.substring(indexBarra);
//	split last A
	String a = str.substring(str.indexOf("a"), str.indexOf("a") + 1); 
	String academia = str.substring((str.indexOf("a") + 1), str.length() - 4);  
	String A = a.toUpperCase(); 
	String academiaDe = academia.substring(0, 7);
	String deAcademia = academia.substring(7, 9);	
	String codigo = academia.substring(10); 
	String c = academia.substring(9, 10);
	String C = c.toUpperCase();
	System.out.println("I am a Code Cadet at " + "< " + A + academiaDe + " " + deAcademia + " " + C + codigo + "_" + " >"); 
	}
}


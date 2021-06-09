import java.util.*;

public class UniqueWords {

    private static final String STRING = "rui rui campelo campelo campelo test abc abc";

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        String[] beuas = STRING.split(" ");

        
        for (String s : beuas){
            set.add(s);
        }
        System.out.println(set);
    }
}

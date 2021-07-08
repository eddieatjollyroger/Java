import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sandbox {
    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world, " + "I hope that someone garbage gets my message in a garbage bottle.";

        String[] messageArray = message.split(" ");

        String maybe = Stream.of(messageArray)
                .filter(word -> !word.equals("garbage"))
                .map(String::toUpperCase)
                //.reduce("", (word, word2) -> word.concat(" " + word2));
                .collect(Collectors.joining(" "));


        System.out.println(maybe);
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sandbox {
    public static void main(String[] args) {

        Sandbox sandbox = new Sandbox();
        String palavroes = "src/Boas.txt";
        String otherFile = "src/otherFile.txt";

        try {
            String[] messageArray = sandbox.readFileByLine(palavroes).split("\n");
            String[] otherFileArray = sandbox.readFileByLine(otherFile).split("\n");

            System.out.println("count number of words: ");
            System.out.println(sandbox.readAndCountWords(messageArray));

            System.out.println("first word longer than 7:");
            System.out.println(sandbox.findFirstWordsLonger(messageArray));

            System.out.println("X longest words: ");
            System.out.println(sandbox.findLongestWords(messageArray, 4));

            System.out.println("Common words between 2 files are: ");
            System.out.println(sandbox.findCommonWords(messageArray, otherFileArray));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String readFileByLine(String file) throws IOException {

        // create a new file reader
        FileReader reader = new FileReader(file);

        // wrap the file reader using a buffered reader
        BufferedReader bReader = new BufferedReader(reader);

        String line = "";
        String result = "";

        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }

        bReader.close();

        return result;
    }

    public String findLongestWords(String[] words, int number) {
        String maybe = Stream.of(words)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(number)
                .collect(Collectors.joining(" "));
        return maybe;
    }

    public long readAndCountWords(String[] words) {
        long maybe = Stream.of(words)
                .count();
        return maybe;
    }

    private String findFirstWordsLonger(String[] messageArray) {
        String firstWord = Stream.of(messageArray)
                .findFirst()
                .filter(word -> word.length() > 7).stream().limit(1)

                .collect(Collectors.joining(" "));
        return firstWord;
    }

    private String findCommonWords(String[] messageArray, String[] otherFile) {
        String firstStream = Stream.of(messageArray)
                .filter(words -> {
                    for (String s : otherFile) {
                        if (words.equals(s)) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.joining(" "));

        return firstStream;
    }
}

public class Machine {
    public static void main(String[] args) {

        MonoMachine <Integer> monoMachine = new MonoMachine();
        Integer result = monoMachine.executeMonomo(m1 -> m1 * m1, 5 );

        Integer result2 = monoMachine.executeBinoni((m1, m2) -> m1 * m2, 2, 6);

        MonoMachine <String> monoMachine1 = new MonoMachine();
        String resultString = monoMachine1.executeMonomo(String::toUpperCase, "boas");

        String resultString2 = monoMachine1.executeBinoni(String::concat, "ora", "boas");



        System.out.println(result);
        System.out.println(resultString);
        System.out.println(result2);
        System.out.println(resultString2);
    }
}

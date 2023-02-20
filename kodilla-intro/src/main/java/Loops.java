public class Loops {
    public static void main(String[] args) {

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int wynik = sumOfNumbers(new int[] {56, 23, 9, 0, -19, 1, 23});
        System.out.println(wynik);
    }
    public static int sumOfNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;

    }
}



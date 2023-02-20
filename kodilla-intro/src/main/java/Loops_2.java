import java.util.Random;

public class Loops_2 {

    public static void main(String[] args) {
        int result = getCountOfRandomNumber(20);
        System.out.println(result);
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
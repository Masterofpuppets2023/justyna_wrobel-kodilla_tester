import java.util.Random;
import java.util.ArrayList;
public class RandomNumbers {
    private int min;
    private int max;
    public void generateNumbers() {
        Random random = new Random();
        int upperBound = 30;
        int firstNumber = random.nextInt(upperBound + 1);
        this.min = firstNumber;
        this.max = firstNumber;
        int sum = 0;

        while (sum < 5000) {
            int nextNumber = random.nextInt(upperBound + 1);
            sum = sum + nextNumber;

            if (this.min > nextNumber) {
                this.min = nextNumber;
            }
            if (this.max < nextNumber) {
                this.max = nextNumber;
            }
        }
    }

    public int min() {
        return this.min;
    }

    public int max() {
        return this.max;
    }
    
    public static void main(String[] args) {
        RandomNumbers xxx = new RandomNumbers();

        xxx.generateNumbers();
        System.out.println("min: " + xxx.min());
        System.out.println("max: " + xxx.max());
    }
}

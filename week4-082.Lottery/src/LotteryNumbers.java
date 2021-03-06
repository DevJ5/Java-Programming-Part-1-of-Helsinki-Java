import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random =  new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers.clear();
        int i = 0;
        int randomNumber;
        while(i < 7) {
            randomNumber = random.nextInt(39) + 1;
            if(!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
                i++;
            }
        }


    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}

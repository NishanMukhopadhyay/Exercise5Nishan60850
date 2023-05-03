import java.util.Random;

public class task2Nishan {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nishanArray60850 = new int[10];

        for(int i = 1; i < nishanArray60850.length; i++) {
            nishanArray60850[i] = (int) (random.nextDouble() * 100 + 1);
        }

        int smallNishan60850 = nishanArray60850[0];
        int largeNishan60850 = nishanArray60850[0];

        for (int i : nishanArray60850) {
            System.out.print(i + ", ");
            if (i > largeNishan60850) {
                largeNishan60850 = i;
            }
            else if (i < smallNishan60850) {
                smallNishan60850 = i;
            }
        }
        System.out.println();
        System.out.println("Largest Value: " + largeNishan60850 + ", Smallest Value: " + smallNishan60850);
    }
}

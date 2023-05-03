public class task3Nishan {

    /**
     *Exercise 5 Task 3
     */
    public static void main(String[] args) {
        int[][] nishanMatrix60850 = new int[10][10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            nishanMatrix60850[i][i] = i;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(nishanMatrix60850[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            sum += nishanMatrix60850[i][i];
        }

        System.out.println("Total of the diagonal elements: " + sum);
    }
}


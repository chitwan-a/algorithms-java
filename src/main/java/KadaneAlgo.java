import java.util.Scanner;

public class KadaneAlgo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of inputs: ");

        int noOfInputs = scanner.nextInt();

        System.out.println("Enter numbers: ");

        int[] input = new int[noOfInputs];

        for (int i = 0; i<noOfInputs ; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println("MaxSubArraySum: " + findMaxSubArraySum(input));
    }

    // keep on adding numbers from array to currentMax, on each addition, check if currentMax is greater than
    // max, if yes, assign currentMax to max and iterate again. If currentMax is negative, then, set currentMax = 0
    // and start the process again from next iteration.
    private static int findMaxSubArraySum(int[] input) {

        int max = 0;

        int currentMax = 0;
        for (int i = 0; i< input.length; i++) {

            currentMax = currentMax + input[i];

            if (currentMax > max) {
                max = currentMax;
            }

            if (currentMax < 0) {
                currentMax = 0;
            }
        }

        return max;
    }
}
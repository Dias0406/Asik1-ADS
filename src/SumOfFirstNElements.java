import java.util.Scanner;

public class SumOfFirstNElements {
    public static int sumArray(int[] arr, int n) {
        return (n <= 0) ? 0 : arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Size: ");
            int[] arr = new int[s.nextInt()];

            for (int i = 0; i < arr.length; i++) arr[i] = s.nextInt();

            System.out.print("N: ");
            System.out.println("Sum: " + sumArray(arr, s.nextInt()));
        }
    }
}

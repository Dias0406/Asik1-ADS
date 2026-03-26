public class SumOfFirstNElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 5;
        int result = sumOfElements(array, n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + result);
    }
    public static int sumOfElements(int[] arr, int n) {
        if (n <= 1) {
            return arr[0];
        }
        return arr[n - 1] + sumOfElements(arr, n - 1);
    }
}

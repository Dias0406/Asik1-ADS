public class SumOfSquares {
    public static void main(String[] args) {
        int n = 4;
        int result = SumOfSquares(n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + result);
    }
    public static int SumOfSquares(int n) {
        if (n<=1) {
            return 1;
        }
        return (n*n) + SumOfSquares(n-1);
    }
}

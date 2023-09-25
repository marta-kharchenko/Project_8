public class Part_1 {
    public static void main(String[] args) {
        printNumberBackward(9);
        System.out.println();
        printNumber(9);
        System.out.println();
        stackOverflowError("Hello!");
    }
    // 1.1 Recursive method printNumberBackward
    public static void printNumberBackward(int i) {
        if (i == 0 ) return;
        System.out.print(i + " ");
        printNumberBackward(i - 1);
    }
    // 1.2 Recursive method printNumber
    public static void printNumber(int j) {
        if (j == 0) return;
        printNumber(j-1);
        System.out.print(j + " ");
    }
    // 1.3 Recursive method with stackOverflowError
    public static void stackOverflowError(String k) {
        stackOverflowError(k);
    }

}

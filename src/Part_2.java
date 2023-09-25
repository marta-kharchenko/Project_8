import java.util.Random;
import java.util.Scanner;

public class Part_2 {
    public static int sum = 0;
    public static int equals = 0;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the size of your random array: ");
        int size = in.nextInt();
        int[] array = createRandomArray(size);
        System.out.println("Here is your random array:");
        printArray(array, 0);
        int sum = arraySum(array, 0);
        System.out.println();
        System.out.println("Here is the sum of your random array:");
        System.out.println(sum);
        System.out.println("Please type down the number you want to search in your array: ");
        int num = in.nextInt();
        System.out.println("The quantity of such numbers is: " + findCountInArray(array, num, 0));
        System.out.println("Please type down the string:");
        in.nextLine();
        String string1 = in.nextLine();
        System.out.println("Here is the string in lines: ");
        printString(string1);
        System.out.println("Here is the reverse string in lines: ");
        printReverseString(string1);
        System.out.println("Here is the reverse string in one line: ");
        System.out.println(reverseString(string1));
    }

    // Method createRandomArray
    public static int[] createRandomArray(int length){
        int[] newArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Change 100 to the desired range
        }
        return newArray;
    }

    // 1.1 Recursive function for printing array elements
    public static void printArray(int[] array, int i) {
        if (i < array.length) {
            System.out.print(array[i] + " ");
            printArray(array, i+1);
        }
    }

    // 1.2 Recursive function to calculate a sum of array elements
    public static int arraySum(int[] array, int i) {
        if (i < array.length) {
            sum += array[i];
            arraySum(array, i+1);
        }
        return sum;
    }

    // 1.3 Recursive function to find how many elements of an array are equal to a given value
    public static int findCountInArray(int[] array, int what, int i) {
        if (i < array.length) {
            if (what == array[i])
                equals += 1;
            findCountInArray(array, what, i+1);
        }
        return equals;
    }

    // 3.1 Recursive method to print String
    public static void printString(String s) {
        if (!s.isEmpty()){
            System.out.println(s.charAt(0));
            printString(s.substring(1));
        }
    }

    // 3.2 Recursive method to print Reverse String
    public static void printReverseString(String s) {
        if (!s.isEmpty()){
            printReverseString(s.substring(1));
            System.out.println(s.charAt(0));
        }
    }

    // 3.3 Recursive method to print Reverse String in one line
    public static String reverseString(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s; //single-character string
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
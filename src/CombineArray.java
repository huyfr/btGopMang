import java.util.Scanner;

public class CombineArray {

    public static int enterSizeArray() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size array:  ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Size does not exceed 10");
            }
        } while (size > 10);
        return size;
    }

    public static void enterValueToArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    public static void displayArray(int[] array, String type) {
        switch (type) {
            case "first":
                System.out.print("Array 1: ");
                for (int values : array) {
                    System.out.print(values + " ");
                }
                System.out.println();
                break;
            case "second":
                System.out.print("Array 2: ");
                for (int values : array) {
                    System.out.print(values + " ");
                }
                System.out.println();
                break;
            case "third":
                System.out.print("Array 3: ");
                for (int values : array) {
                    System.out.print(values + " ");
                }
                System.out.println();
                break;
        }
    }

    public static int[] combineArray(int[] array1, int[] array2) {
        int lengthOfArray3 = array1.length + array2.length;
        int[] array3 = new int[lengthOfArray3];

        for (int i = 0; i < lengthOfArray3; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        return array3;
    }
}
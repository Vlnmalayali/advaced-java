import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListArrayConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. List to Array");
        System.out.println("2. Array to List");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Convert list to array
            List<Integer> myList = new ArrayList<>();
            System.out.println("Enter the elements of the list (type any non-integer to stop):");
            while (scanner.hasNextInt()) {
                myList.add(scanner.nextInt());
            }

            Integer[] array = myList.toArray(new Integer[myList.size()]);
            System.out.println("Array from List: " + Arrays.toString(array));
        } else if (choice == 2) {
            // Convert array to list
            List<Integer> list = new ArrayList<>();
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                list.add(scanner.nextInt());
            }

            Integer[] myArray = list.toArray(new Integer[list.size()]);
            System.out.println("List from Array: " + list);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
//vishnulal

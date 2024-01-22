package hashmaps;

import java.util.Scanner;
import java.util.HashMap;

public class FindFrequency {
    public static void main(String[] array) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter size of the array: ");
            int size = in.nextInt();

            System.out.print("Enter the array: ");
            int[] arr = new int[size];

            // creating an array with for loop
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }

            int[] arrToSearch = { 2, 3, 4 };

            findFrequency(arr, arrToSearch);
        }
    }

    private static void findFrequency(int[] arr, int[] arrToSearch) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // find the frequency
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (map.containsKey(element)) {
                // find the current frequency
                int currentFrequency = map.get(element);
                // and update it along with increment the counter
                map.put(element, currentFrequency + 1);
            } else {
                // add it to the map
                map.put(element, 1);
            }
        }

        // print the frequency of every element present in the second array
        for (int j = 0; j < arrToSearch.length; j++) {
            int element = arrToSearch[j];
            if (map.containsKey(element)) {
                System.out.println(element + " : " + map.get(element));
            } else {
                System.out.println(element + " : " + 0);
            }
        }
    }
}

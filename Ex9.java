import java.util.*;

public class GenericMaximum {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 25, 7, 45, 18};
        Double[] decimals = {2.5, 8.7, 4.3, 9.1, 6.2};
        String[] names = {"Apple", "Mango", "Orange", "Banana"};

        System.out.println("Maximum Integer: " + findMax(numbers));
        System.out.println("Maximum Double: " + findMax(decimals));
        System.out.println("Maximum String: " + findMax(names));
    }
}


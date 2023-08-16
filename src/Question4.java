import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BubbleSortExample {
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);

        System.out.println("Original list: " + numbers);

        bubbleSort(numbers);

        System.out.println("Sorted list (using Bubble Sort): " + numbers);
    }
}

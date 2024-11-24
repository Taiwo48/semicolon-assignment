
import java.util.*;

public class LargestElement {
    public static int findLargestElement(List<Integer> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 7, 23, 56, 89, 34);
        System.out.println("Largest element: " + findLargestElement(numbers));
    }
}


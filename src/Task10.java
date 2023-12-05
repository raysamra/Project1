import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {
        String [] colors= {"red", "blue", "purple", "orange", "blue", "red"};
        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> duplicateElements = new HashSet<>();

        for (String element : colors) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        System.out.println("Duplicate Elements in the Array:");

        for (String duplicate : duplicateElements) {
            System.out.println(duplicate);
        }

    }
}

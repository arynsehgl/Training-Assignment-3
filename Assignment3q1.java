import java.util.ArrayList;

public class Assignment3q1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);

        int elementToSearch = 2;
        int firstIndex = list.indexOf(elementToSearch);
        int lastIndex = list.lastIndexOf(elementToSearch);

        if (firstIndex != -1) {
            System.out.println("Element " + elementToSearch + " is present in the ArrayList");
            System.out.println("First occurance of element " + elementToSearch + " is at index " + firstIndex);
            System.out.println("Last occurance of element " + elementToSearch + " is at index " + lastIndex);
        } else {
            System.out.println("Element " + elementToSearch + " is not present in the ArrayList");
        }
    }
}

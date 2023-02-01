import java.util.ArrayList;

public class Assignment3q2 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");

        System.out.println("Before copy : " + list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        list1.addAll(0, list2);

        System.out.println("After copy : " + list1);
    }
}

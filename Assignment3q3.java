import java.util.ArrayList;

class Assignment3q3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Before swaping, ArrayList contains : " + list);
        int lastIndex = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(lastIndex - i));
            list.set(lastIndex - i, temp);
        }

        System.out.println("After swaping, ArrayList contains : " + list);
    }
}

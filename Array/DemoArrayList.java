import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // menambahkan data ke dalam ArrayList
        list.add("Hello");
        list.add("World");
        list.add("!");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class tugas8MethodSelectionSortDescendingArrayList {

    public static void selectionSortDescendingArrayList(ArrayList<Integer> arr) {
        int max, temp;
        for (int i = 0; i < (arr.size() - 1); i++) {
            max = i;
            for (int j = (i + 1); j < arr.size(); j++) {
                if (arr.get(j) > arr.get(max)) {
                    max = j;
                }
            }
            temp = arr.get(i);
            arr.set(i, arr.get(max));
            arr.set(max, temp);
        }

        for (int n = 0; n < arr.size(); n++) {
            System.out.print(arr.get(n) + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            arr.add(input.nextInt());
        }

        System.out.println("\nData sebelum diurutkan: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }

        System.out.println("\nData setelah diurutkan: ");
        selectionSortDescendingArrayList(arr);
    }
}
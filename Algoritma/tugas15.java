import java.util.Arrays;
import javax.swing.JOptionPane;

public class tugas15 {
    public static void binarySearch(int[] data, int key) {
        Arrays.sort(data);

        System.out.println("Data array setelah diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

        int indexTengah = data.length / 2;
        int index = indexTengah;

        boolean ketemu = false;

        while (index >= 0 && index < data.length && ketemu == false) {
            if (key == data[index]) {
                System.out.println("Angka " + key + " ditemukan pada index ke-" + index);
                ketemu = true;
                break;
            } else if (key < data[indexTengah]) {
                index--;
            } else {
                index++;
            }
        }

        if (!ketemu) {
            System.out.println("Angka " + key + " tidak ditemukan di dalam data array");
        }
    }

    public static void main(String[] args) {
        int data[] = { 9, 6, 4, 3, 7, 1, 6, 10, 20, 61, 43, 80, 100, 54, 32, 36, 75, 81, 17, 19, 1020 };
        int key = Integer.parseInt(JOptionPane.showInputDialog("Inputkan angka yang dicari"));

        binarySearch(data, key);
    }
}
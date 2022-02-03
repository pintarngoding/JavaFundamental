import java.io.*;
import java.util.Arrays;

public class tugas14 {
    public static void main(String[] args) throws IOException {
        int data[] = { 85, 30, 55, 80, 100, 65, 35, 20, 70, 65, 10, 40, 82, 90 };
        Arrays.sort(data);

        System.out.println("Data array setelah diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan angka yang dicari: ");
        int key = Integer.parseInt(input.readLine());

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
}
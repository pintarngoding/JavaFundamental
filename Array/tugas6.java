import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah angka: ");
        int n = input.nextInt();

        int angka[] = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Inputkan angka ke-" + (i + 1) + " = ");
            angka[i] = input.nextInt();
        }

        // Menentukan angka terbesar
        int max = angka[0]; //diatur diawal sebagai nilai max nya adalah data array index ke-0
        for (int i = 0; i < angka.length; i++) {
            if(angka[i] > max){
                max = angka[i];
            }
        }

        System.out.println("\nMaka angka terbesar adalah: " + max);
    }
}
import java.util.Scanner;

public class AngkaGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Angka Pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Inputkan Angka Kedua: ");
        int angka2 = input.nextInt();

        if (angka1 % 2 == 0) {
            System.out.println("Angka pertama: " + angka1 + " adalah BILANGAN GENAP");
        } else {
            System.out.println("Angka pertama: " + angka1 + " adalah BILANGAN GANJIL");
        }

        if (angka2 % 2 == 0) {
            System.out.println("Angka kedua: " + angka2 + " adalah BILANGAN GENAP");
        } else {
            System.out.println("Angka kedua: " + angka2 + " adalah BILANGAN GANJIL");
        }
    }
}

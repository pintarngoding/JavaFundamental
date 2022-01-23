import java.util.ArrayList;
import java.util.Scanner;

public class tugas17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> merkLaptop = new ArrayList<>();
        int menu;
        do {
            System.out.println("Pilihan Menu:");
            System.out.println("1. Menambahkan data nama merk laptop");
            System.out.println("2. Melihat daftar nama merk laptop");
            System.out.println("0. Keluar");
            System.out.print("Pilih nomor menu: ");
            menu = input.nextInt();

            System.out.println();

            switch (menu) {
                case 1:
                    System.out.print("Inputkan data merk laptop: ");
                    merkLaptop.add(input.next());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Daftar nama merk laptop:");
                    for (int i = 0; i < merkLaptop.size(); i++) {
                        System.out.println((i + 1) + ". " + merkLaptop.get(i));
                    }
                    System.out.println();
                    break;
            }
        } while (menu != 0);
    }
}

import java.util.ArrayList;

public class tugas14 {
    public static void main(String[] args) {
        ArrayList<String> namaTokoh = new ArrayList<>();

        namaTokoh.add("Steve Jobs");
        namaTokoh.add("Bill Gates");
        namaTokoh.add("Mark Zuckerberg");
        namaTokoh.add("Elon Musk");

        System.out.println("Daftar Nama Tokoh Teknologi:");
        for (int i = 0; i < namaTokoh.size(); i++) {
            System.out.println((i + 1) + ". " + namaTokoh.get(i));
        }

        namaTokoh.remove(1);
        System.out.println("\nDaftar Nama Tokoh Teknologi Setelah Dihapus:");
        for (int i = 0; i < namaTokoh.size(); i++) {
            System.out.println((i + 1) + ". " + namaTokoh.get(i));
        }
    }
}

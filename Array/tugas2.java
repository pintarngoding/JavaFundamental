import javax.swing.JOptionPane;

public class tugas2 {
    public static void main(String[] args) {
        String namaSiswa[] = new String[5];

        // looping untuk inputan user dan menyimpan ke array
        for (int i = 0; i < namaSiswa.length; i++) {
            namaSiswa[i] = JOptionPane.showInputDialog("Masukkan nama teman Anda");
        }

        // menampilkan isi array
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println((i + 1) + ". " + namaSiswa[i]);
        }
    }
}
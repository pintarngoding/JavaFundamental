import javax.swing.JOptionPane;

public class tugas4 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Inputkan nama lengkap");
        String nis = JOptionPane.showInputDialog("Inputkan NIS");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Inputkan umur"));

        // menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("NIS: " + nis);
        System.out.println("Umur: " + umur + " tahun");

    }
}

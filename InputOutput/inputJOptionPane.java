import javax.swing.JOptionPane;

public class inputJOptionPane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Inputkan nama");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Inputkan usia"));

        // menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

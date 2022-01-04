import java.io.*;

public class tugas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan nama sekolah: ");
        String namasekolah = input.readLine();

        System.out.print("Inputkan jarak rumah ke sekolah: ");
        double jaraktempuh = Double.parseDouble(input.readLine());

        System.out.print("Inputkan kode plat nomor kendaraan: ");
        char kodeplat = input.readLine().charAt(0);

        System.out.print("Inputkan anak ke berapa: ");
        int anakke = Integer.parseInt(input.readLine());

        // menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama Sekolah: " + namasekolah);
        System.out.println("Jarak Rumah ke Sekolah: " + jaraktempuh + " km");
        System.out.println("Kode Plat Nomor Kendaraan: " + kodeplat);
        System.out.println("Anak ke Berapa: " + anakke);
    }
}

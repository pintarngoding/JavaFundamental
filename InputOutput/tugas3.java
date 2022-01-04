import java.io.Console;

public class tugas3 {
    public static void main(String[] args) {
        Console input = System.console();

        System.out.print("Inputkan jenis kelamin: ");
        String jeniskelamin = input.readLine();

        System.out.print("Inputkan nomor sepatu: ");
        int nosepatu = Integer.parseInt(input.readLine());

        System.out.print("Inputkan apakah sudah menikah?: ");
        boolean sudahmenikah = Boolean.parseBoolean(input.readLine());

        // menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Nomor Sepatu: " + nosepatu);
        System.out.println("Sudah Menikah? " + sudahmenikah);
    }
}

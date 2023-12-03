import java.util.InputMismatchException;
import java.util.Scanner;

public class SupermarketProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.next();

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.next();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.next();

            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            Barang barang = new BarangDasar(namaBarang, hargaBarang, jumlahBeli);

            System.out.println("\nDetail Pembelian:");
            System.out.println("No. Faktur: " + noFaktur);
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            barang.tampilDetail();

        } catch (InputMismatchException e) {
            System.out.println("Error: Masukan tidak valid. Pastikan Anda memasukkan tipe data yang benar.");
        } finally {
            System.out.println("Program selesai.");
            scanner.close();
        }
    }
}

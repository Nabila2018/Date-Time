import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class SupermarketProgram {
    private String namaSupermarket;
    private Date tanggal;
    private String waktu;
    private String namaPelanggan;
    private String nomorHP;
    private String alamat;
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBeli;
    private double totalBayar;
    private String namaKasir;

    // Constructor
    public SupermarketProgram(String namaSupermarket, Date tanggal, String waktu,
                               String namaPelanggan, String nomorHP, String alamat,
                               String kodeBarang, String namaBarang, double hargaBarang,
                               int jumlahBeli, double totalBayar, String namaKasir) {
        this.namaSupermarket = namaSupermarket;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.namaPelanggan = namaPelanggan;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
        this.totalBayar = totalBayar;
        this.namaKasir = namaKasir;
    }

    // Getter methods
    public String getNamaSupermarket() {
        return namaSupermarket;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    // Method to format date as a string
    public String formatDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        return dateFormat.format(tanggal);
    }

     public String formatTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        return timeFormat.format(tanggal);
    }

    
    public void displayData() {
        System.out.println("      Billy's MiniMart\t\t     ");

        System.out.println("Tanggal : " + formatDate());
        System.out.println("Waktu   :  " + waktu );
        System.out.println("===============================");
        System.out.println("       DATA PELANGGAN\t\t      ");
        System.out.println("-------------------------------");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("No. HP         : " + nomorHP);
        System.out.println("Alamat         : " + alamat);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("    DATA PEMBELIAN BARANG\t\t   ");
        System.out.println("-------------------------------");
        System.out.println("Kode Barang       : " + kodeBarang);
        System.out.println("Nama Barang       : " + namaBarang);
        System.out.println("Harga Barang      : " + hargaBarang);
        System.out.println("Jumlah Beli       : " + jumlahBeli);
        System.out.println("TOTAL BAYAR       : " + totalBayar);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Kasir    : " + namaKasir);
    }

   
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama Supermarket/Mini Market: ");
        String namaSupermarket = scanner.nextLine();

        Date tanggalPembelian = new Date();  // Tanggal saat ini
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss Z");
        String waktuPembelian = dateFormat.format(new Date());  // Waktu saat ini

        System.out.println("DATA PELANGGAN");
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("No. HP         : ");
        String nomorHP = scanner.nextLine();
        System.out.print("Alamat         : ");
        String alamat = scanner.nextLine();

        System.out.println("DATA PEMBELIAN BARANG");
        System.out.print("Kode Barang    : ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang    : ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang   : ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Jumlah Beli    : ");
        int jumlahBeli = scanner.nextInt();

        // Hitung total bayar
        double totalBayar = hargaBarang * jumlahBeli;

        scanner.nextLine();  // Membersihkan newline di buffer
        System.out.print("Masukkan Nama Kasir: ");
        String namaKasir = scanner.nextLine();

        //  objek Supermarket
        SupermarketProgram transaksi = new SupermarketProgram(
                namaSupermarket, tanggalPembelian, waktuPembelian,
                namaPelanggan, nomorHP, alamat,
                kodeBarang, namaBarang, hargaBarang,
                jumlahBeli, totalBayar, namaKasir
        );

        // Tampilkan data transaksi
        transaksi.displayData();
        scanner.close();
    }
}

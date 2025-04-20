import java.util.Scanner;
import database.dataUser;
import entity.Pelanggan;


//main menu

public class App {
    private static dataUser dataUser = new dataUser();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        adminMenu();
    }

    private static void adminMenu() {
        System.out.println("Masuk sebagai admin");

        while (true) {
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat List Pelanggan");
            System.out.println("3. Update Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    tambahPelanggan();
                    break;
                case 2:
                    lihatPelanggan();
                    break;
                case 3:
                    updatePelanggan();
                    break;
                case 4:
                    hapusPelanggan();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    // Fungsi tambah pelanggan yang lama
//    private static void tambahPelanggan() {
//        System.out.print("Masukan Nama: ");
//        String nama = scanner.nextLine();
//        System.out.print("Masukan Alamat: ");
//        String alamat = scanner.nextLine();
//        System.out.print("Masukan No Telp: ");
//        String noTelp = scanner.nextLine();
//        System.out.print("Masukan No KTP: ");
//        String noKTP = scanner.nextLine();
//        dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP);
//        System.out.println("Berhasil menambahkan pelanggann");
//    }
    // Fungsi liat pelanggan yang lama
//    private static void lihatPelanggan() {
//        dataUser.lihatPelanggan();
//    }

    // Fungsi tambah pelanggan yang baru
    private static void tambahPelanggan() {
        System.out.println("Pilih Tipe Pelanggan:");
        System.out.println("1. Biasa");
        System.out.println("2. Reguler");
        System.out.println("3. Premium");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Buang newline

        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukan No Telp: ");
        String noTelp = scanner.nextLine();
        System.out.print("Masukan No KTP: ");
        String noKTP = scanner.nextLine();

        switch (pilihan) {
            case 1:
                // kamu bisa aktifkan versi default ini di dataUser
                dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP);
                break;
            case 2:
                System.out.print("Masukan Poin Awal: ");
                int poin = scanner.nextInt();
                scanner.nextLine();
                dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP, poin);
                break;
            case 3:
                System.out.print("Masukan Diskon (%): ");
                double diskon = scanner.nextDouble();
                scanner.nextLine();
                dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP, diskon);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Berhasil menambahkan pelanggan");
    }

    private static void updatePelanggan() {
        System.out.print("Masukan No KTP Pelanggan yang ingin di ubah: ");
        String noKTPUpdate = scanner.nextLine();
        System.out.print("Masukan Nama Baru: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Alamat Baru: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukan No Telp Baru: ");
        String noTelp = scanner.nextLine();
        dataUser.updatePelanggan(noKTPUpdate, nama, alamat, noTelp);
    }

    private static void hapusPelanggan() {
        System.out.print("Masukan No KTP Pelanggan yang ingin dihapus: ");
        String noKTPHapus = scanner.nextLine();
        dataUser.hapusPelanggan(noKTPHapus);
    }

    //  Penggunaan Polymorphosis
    private static void lihatPelanggan() {
        if (dataUser.pelangganList.isEmpty()) {
            System.out.println("Tidak ada data pelanggan.");
            return;
        }

        for (Pelanggan pelanggan : dataUser.pelangganList) {
            System.out.println("==================================");
            System.out.println(pelanggan.getInfoPelanggan());
        }
    }

}
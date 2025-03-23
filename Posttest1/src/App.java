import java.util.Scanner;
import database.dataUser;
import entity.Pelanggan;

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

    private static void tambahPelanggan() {
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukan No Telp: ");
        String noTelp = scanner.nextLine();
        System.out.print("Masukan No KTP: ");
        String noKTP = scanner.nextLine();
        dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP);
        System.out.println("Berhasil menambahkan pelanggann");
    }
    private static void lihatPelanggan() {
        dataUser.lihatPelanggan();
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
}
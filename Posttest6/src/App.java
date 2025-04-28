import java.util.InputMismatchException;
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

            try {
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
            } catch (Exception e) {
                System.out.println("Input harus berupa angka! Silahkan ulangi.");
                scanner.nextLine(); // reset scanner
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
        boolean validInput = false;
        int pilihan = 0;

        while (!validInput) {
            try {
                System.out.println("Pilih Tipe Pelanggan:");
                System.out.println("1. Biasa");
                System.out.println("2. Reguler");
                System.out.println("3. Premium");
                System.out.print("Pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan >= 1 && pilihan <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Pilihan hanya boleh 1, 2, atau 3. Silakan ulangi.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka! Silakan ulangi.\n");
                scanner.nextLine();
            }
        }

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
                dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP);
                break;
            case 2:
                System.out.print("Masukan Poin Awal: ");
                int poin = 0;
                try {
                    poin = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Input poin harus angka! Diisi 0 otomatis.");
                    scanner.nextLine();
                    poin = 0;
                }
                dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP, poin);
                break;
            case 3:
                System.out.print("Masukan Diskon (%): ");
                double diskon = 0.0;
                try {
                    diskon = scanner.nextDouble();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Input diskon harus angka! Diisi 0 otomatis.");
                    scanner.nextLine();
                    diskon = 0.0;
                }
                dataUser.tambahPelanggan(nama, alamat, noTelp, noKTP, diskon);
                break;
        }

        System.out.println("Berhasil menambahkan pelanggan\n");
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
package database;
import entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import entity.PelangganPremium;
import entity.PelangganReguler;
import entity.PelangganBiasa;

public final class dataUser { //final class
    public List<Pelanggan> pelangganList = new ArrayList<>(); //default
    protected List<String> userAccount = new ArrayList<>(); //protected
    private static int jumlahPelanggan = 0; // staticvariabel

    public static int getJumlahPelanggan() { // static method
        return jumlahPelanggan;
    }

    public void tambahPelanggan(String nama, String alamat, String noTelp, String noKTP) {
        Pelanggan pelanggan = new PelangganBiasa(nama, alamat, noTelp, noKTP); // ✅
        pelangganList.add(pelanggan);
        userAccount.add(nama);
        jumlahPelanggan++;
        System.out.println("Data berhasil ditambahkan");
    }

    public void lihatPelanggan() {
        if (pelangganList.isEmpty()) {
            System.out.println("Tidak ada data pelanggan.");
            return;
        }

        int index = 1;
        for (Pelanggan pelanggan : pelangganList) {
            System.out.println("No." + index++);
            System.out.println("Nama: " + pelanggan.getNama());
            System.out.println("Alamat: " + pelanggan.getAlamat());
            System.out.println("No Telp: " + pelanggan.getNoTelp());
            System.out.println("No KTP: " + pelanggan.getNoKTP());
            System.out.println("==================================");
        }
    }

    public void updatePelanggan(String noKTP, String nama, String alamat, String noTelp) {
        Pelanggan pelanggan = cariPelanggan(noKTP);
        if (pelanggan != null) {
            pelanggan.setNama(nama);
            pelanggan.setAlamat(alamat);
            pelanggan.setNoTelp(noTelp);
            System.out.println("Data berhasil diupdate");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void hapusPelanggan(String noKTP) {
        Pelanggan pelanggan = cariPelanggan(noKTP);
        if (pelanggan != null) {
            pelangganList.remove(pelanggan);
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    private Pelanggan cariPelanggan(String noKTP) {
        for (Pelanggan pelanggan : pelangganList) {
            if (pelanggan.getNoKTP().equals(noKTP)) {
                return pelanggan;
            }
        }
        return null;
    }
    // Overload pelanggan reguler
    public void tambahPelanggan(String nama, String alamat, String noTelp, String noKTP, int poin) {
        PelangganReguler pelanggan = new PelangganReguler(nama, alamat, noTelp, noKTP, poin);
        pelangganList.add(pelanggan);
        userAccount.add(nama);
        System.out.println("Data Reguler berhasil ditambahkan");
    }

    // Overloade pelanggan premium
    public void tambahPelanggan(String nama, String alamat, String noTelp, String noKTP, double diskon) {
        PelangganPremium pelanggan = new PelangganPremium(nama, alamat, noTelp, noKTP, diskon);
        pelangganList.add(pelanggan);
        userAccount.add(nama);
        System.out.println("Data Premium berhasil ditambahkan");
    }

}
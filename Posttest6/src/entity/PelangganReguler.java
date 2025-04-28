package entity;

public class PelangganReguler extends Pelanggan implements MemberBenefit{
    private int poin;

    public PelangganReguler(String nama, String alamat, String noTelp, String noKTP, int poin) {
        super(nama, alamat, noTelp, noKTP);
        this.poin = poin;
    }
    // Override
    @Override
    public String getInfoPelanggan() {
        return super.getInfoPelanggan() + "\nPoin: " + poin;
    }

    @Override
    public double hitungBenefit() {
        return poin * 0.1; // setiap poin dihargai 0.1
    }

    @Override
    public String getDeskripsiBenefit() {
        return "Potongan harga sebesar Rp " + hitungBenefit();
    }

    @Override
    public double hitungDiskon(double totalBayar) {
        return 0;
    }

    @Override
    public String deskripsiBenefit() {
        return "";
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }
    public String getTipePelanggan() { // Override abstrack method
        return "Reguler";
    }
}

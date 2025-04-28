package entity;

public class PelangganPremium extends Pelanggan implements MemberBenefit {
    private double diskon;

    public PelangganPremium(String nama, String alamat, String noTelp, String noKTP, double diskon) {
        super(nama, alamat, noTelp, noKTP);
        this.diskon = diskon;
    }

    // Override
    @Override
    public String getInfoPelanggan() {
        return super.getInfoPelanggan() + "\nDiskon: " + diskon + "%";
    }

    @Override
    public double hitungBenefit() {
        return diskon; // diskon dalam persen
    }

    @Override
    public String getDeskripsiBenefit() {
        return "Diskon sebesar " + diskon + "% untuk semua transaksi.";
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getTipePelanggan() {
        return "Premium";
    }

    @Override
    public double hitungDiskon(double totalBayar) {
        return 0;
    }

    @Override
    public String deskripsiBenefit() {
        return "";
    }
}

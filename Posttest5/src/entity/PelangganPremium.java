package entity;

public class PelangganPremium extends Pelanggan {
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


    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getTipePelanggan() {
        return "Premium";
    }
}

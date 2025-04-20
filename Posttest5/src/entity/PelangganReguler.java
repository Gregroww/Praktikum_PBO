package entity;

public class PelangganReguler extends Pelanggan {
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

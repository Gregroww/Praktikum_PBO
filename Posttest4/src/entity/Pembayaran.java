package entity;

public class Pembayaran {
    private String noPembayaran;
    private String noReservasi;
    private String tglPembayaran;
    private int totalBiaya;

    public Pembayaran(){}
    public Pembayaran(String noPembayaran, String noReservasi, String tglPembayaran, int totalBiaya){
        this.noPembayaran = noPembayaran;
        this.noReservasi = noReservasi;
        this.tglPembayaran = tglPembayaran;
        this.totalBiaya = totalBiaya;
    }

    public void setNoPembayaran(String noPembayaran){
        this.noPembayaran = noPembayaran;
    }

    public void setNoReservasi(String noReservasi){
        this.noReservasi = noReservasi;
    }

    public void setTglPembayaran(String tglPembayaran){
        this.tglPembayaran = tglPembayaran;
    }

    public void setTotalBiaya(int totalBiaya){
        this.totalBiaya = totalBiaya;
    }

    public String getNoPembayaran(){
        return noPembayaran;
    }

    public String getNoReservasi(){
        return noReservasi;
    }

    public String getTglPembayaran(){
        return tglPembayaran;
    }

    public int getTotalBiaya(){
        return totalBiaya;
    }
}

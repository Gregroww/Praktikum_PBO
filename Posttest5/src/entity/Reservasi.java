package entity;

public class Reservasi {
    private String noReservasi;
    private String noKamar;
    private String noKTP;
    private String tglCheckIn;
    private String tglCheckOut;
    private int lamaInap;
    private int totalBiaya;

    public Reservasi(){}
    public Reservasi(String noReservasi, String noKamar, String noKTP, String tglCheckIn, String tglCheckOut, int lamaInap, int totalBiaya){
        this.noReservasi = noReservasi;
        this.noKamar = noKamar;
        this.noKTP = noKTP;
        this.tglCheckIn = tglCheckIn;
        this.tglCheckOut = tglCheckOut;
        this.lamaInap = lamaInap;
        this.totalBiaya = totalBiaya;
    }

    public void setNoReservasi(String noReservasi){
        this.noReservasi = noReservasi;
    }

    public void setNoKamar(String noKamar){
        this.noKamar = noKamar;
    }

    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }

    public void setTglCheckIn(String tglCheckIn){
        this.tglCheckIn = tglCheckIn;
    }

    public void setTglCheckOut(String tglCheckOut){
        this.tglCheckOut = tglCheckOut;
    }

    public void setLamaInap(int lamaInap){
        this.lamaInap = lamaInap;
    }

    public void setTotalBiaya(int totalBiaya){
        this.totalBiaya = totalBiaya;
    }

    public String getNoReservasi(){
        return noReservasi;
    }

    public String getNoKamar(){
        return noKamar;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public String getTglCheckIn(){
        return tglCheckIn;
    }

    public String getTglCheckOut(){
        return tglCheckOut;
    }

    public int getLamaInap(){
        return lamaInap;
    }

    public int getTotalBiaya(){
        return totalBiaya;
    }
}

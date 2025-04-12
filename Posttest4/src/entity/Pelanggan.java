package entity;

public class Pelanggan {
    private String nama;
    private String alamat;
    private String noTelp;
    private String noKTP;

    public Pelanggan(){}
    public Pelanggan(String nama, String alamat, String noTelp, String noKTP){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.noKTP = noKTP;
    }

    // Getter and Setter

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }

    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getNoTelp(){
        return noTelp;
    }

    public String getNoKTP(){
        return noKTP;
    }
    
}

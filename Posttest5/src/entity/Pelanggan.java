package entity;

public abstract class Pelanggan { //abstract class
    private String nama;
    private String alamat;
    private String noTelp;
    private final String noKTP;   //final atribut

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


    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getNoTelp(){
        return noTelp;
    }

    public final String getNoKTP(){ // final method
        return noKTP;
    }

    // Superclass

    public String getInfoPelanggan() {
        return "Tipe: " + getTipePelanggan() + "\nNama: " + nama + "\nAlamat: " + alamat + "\nNo Telp: " + noTelp + "\nNo KTP: " + noKTP;
    }

    public abstract String getTipePelanggan(); // abstract method
}

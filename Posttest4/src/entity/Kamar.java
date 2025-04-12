package entity;

public class Kamar {
    private String noKamar;
    private String tipeKamar;
    private int harga;
    private String status;

    public Kamar(){}
    public Kamar(String noKamar, String tipeKamar, int harga, String status){
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.status = status;
    }

    public void setNoKamar(String noKamar){
        this.noKamar = noKamar;
    }

    public void setTipeKamar(String tipeKamar){
        this.tipeKamar = tipeKamar;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getNoKamar(){
        return noKamar;
    }

    public String getTipeKamar(){
        return tipeKamar;
    }

    public int getHarga(){
        return harga;
    }

    public String getStatus(){
        return status;
    }
    
}

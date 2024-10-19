package pojo;

public class Angaralilar {

    private String ad;

    private String soyad;

    public Angaralilar(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Angaralilar{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}

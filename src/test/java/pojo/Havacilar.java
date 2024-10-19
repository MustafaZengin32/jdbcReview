package pojo;

public class Havacilar {

    private int id;
    private String isim;
    private String soyisim;

    private String sinif;

    public Havacilar(int id, String isim, String soyisim, String sinif) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Havacilar{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}

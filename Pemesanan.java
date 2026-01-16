//==CLASS PEMESANAN==
public class Pemesanan {
    private String IDPemesanan;
    private double durasiJam;
    private String IDRuangan;
    private String IDKonsol;

    public String getIDPemesanan() {
        return IDPemesanan;
    }

    public void setIDPemesanan(String newIDPemesanan) {
        this.IDPemesanan = newIDPemesanan;
    }

    public void buatPemesanan(String IDRuangan, String IDKonsol, double durasiJam) {
        this.IDRuangan = IDRuangan;
        this.IDKonsol = IDKonsol;
        this.durasiJam = durasiJam;
    }

    public double getDurasiJam() {
        return durasiJam;
    }

    public String getIDKonsol() {
        return IDKonsol;
    }
}

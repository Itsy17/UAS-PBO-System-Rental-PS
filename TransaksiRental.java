//==CLASS TRANSAKSI RENTAL==
public class TransaksiRental {
    private String IDTransaksi;
    private double totalJam;

    public String getIDTransaksi() {
        return IDTransaksi;
    }

    public void setIDTransaksi(String newIDTransaksi) {
        this.IDTransaksi = newIDTransaksi;
    }

    public void setTotalJam(double newTotalJam) {
        this.totalJam = newTotalJam;
    }

    public void prosesTransaksi(Konsol konsol, double durasiJam) {
        double totalBiaya = konsol.hitungBiayaSewa(durasiJam);
        System.out.println("Transaksi berhasil. Total biaya: Rp " + totalBiaya);
    }
}

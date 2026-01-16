//==CLASS RUANGPS==
import java.util.ArrayList;

public class RuangPS {
    private String IDRuangan;
    private ArrayList<Konsol> daftarKonsol = new ArrayList<>();

    public String getIDRuangan() {
        return IDRuangan;
    }

    public void setIDRuangan(String newIDRuangan) {
        this.IDRuangan = newIDRuangan;
    }

    public void tambahKonsol(Konsol konsol) {
        daftarKonsol.add(konsol);
    }

    public boolean cekStatusKonsol(String IDKonsol) {
        for (Konsol k : daftarKonsol) {
            if (k.getIDKonsol().equals(IDKonsol)) {
                return k.getStatusKonsol();
            }
        }
        return false;
    }

    public ArrayList<Konsol> getDaftarKonsol() {
        return daftarKonsol;
    }
}

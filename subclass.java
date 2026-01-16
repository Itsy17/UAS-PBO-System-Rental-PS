//==SUBCLASS PS3/PS4/PS5==
public class subclass {
    public static class PS3 extends Konsol {
        private double hargaPerJam;

        public PS3(String IDKonsol, double hargaPerJam) {
            this.IDKonsol = IDKonsol;
            this.hargaPerJam = hargaPerJam;
            this.statusKonsol = true;
        }

        @Override
        public double hitungBiayaSewa(double durasiJam) {
            return hargaPerJam * durasiJam;
        }
    }

    public static class PS4 extends Konsol {
        private double hargaPerJam;

        public PS4(String IDKonsol, double hargaPerJam) {
            this.IDKonsol = IDKonsol;
            this.hargaPerJam = hargaPerJam;
            this.statusKonsol = true;
        }

        @Override
        public double hitungBiayaSewa(double durasiJam) {
            return hargaPerJam * durasiJam;
        }
    }

    public static class PS5 extends Konsol {
        private double hargaPerJam;

        public PS5(String IDKonsol, double hargaPerJam) {
            this.IDKonsol = IDKonsol;
            this.hargaPerJam = hargaPerJam;
            this.statusKonsol = true;
        }

        @Override
        public double hitungBiayaSewa(double durasiJam) {
            return hargaPerJam * durasiJam;
        }
    }

}

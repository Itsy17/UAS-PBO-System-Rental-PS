//==CLASS KONSOL==
public abstract class Konsol {
        protected String IDKonsol;
        protected boolean statusKonsol;

        public String getIDKonsol() {
            return IDKonsol;
        }

        public void setIDKonsol(String newIDKonsol) {
            this.IDKonsol = newIDKonsol;
        }

        public boolean getStatusKonsol() {
            return statusKonsol;
        }

        public void setStatusKonsol(boolean newStatusKonsol) {
            this.statusKonsol = newStatusKonsol;
        }

    public abstract double hitungBiayaSewa(double durasiJam);
}
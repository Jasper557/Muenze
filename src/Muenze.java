public class Muenze {
    enum ART {CENT, EURO}

    private int wert;
    private ART art;

    public Muenze(int wert, ART art) {
        this.wert = wert;
        this.art = art;
    }

    public int getWert() {
        return wert;
    }

    public ART getArt() {
        return art;
    }

    @Override
    public String toString() {
        return wert + " " + art;
    }

}

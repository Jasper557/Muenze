package Muenzstapel;

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

    public void setWert(int wert) {
        this.wert = wert;
    }


    public ART getArt() {
        return art;
    }

    public void setArt(ART art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return wert + " " + art;
    }

}

package bowlingtest;


public class Bowling {

    private int levittBabukSzama = 0;
    private int guritasokSzama = 0;

    public int getBabukSzama() {

        return 10 - levittBabukSzama;
    }

    public void guritas(int i) {

        if (!vegeVanEAKornek()) {
            guritasokSzama++;
            levittBabukSzama += i;
        }

    }

    public boolean vegeVanEAKornek() {
        return guritasokSzama >= 2 || levittBabukSzama == 10;

    }

    public int getLevittBabukSzama() {
        return levittBabukSzama;
    }
}

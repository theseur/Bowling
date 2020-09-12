package bowlingtest;

public class BowlingPontokSzamolasa {

    private int jatekosokSzama;
    private int pontokSzama=0;
    Bowling bowling = new Bowling();

    public BowlingPontokSzamolasa(int i) {
        jatekosokSzama=i;
    }

    public int getJatekosokSzama() {
        return jatekosokSzama;
    }

    public int getGuritasElottiBabukSzama() {

        return bowling.getBabukSzama();
    }

    public int getPontokSzáma(int i) {
        return pontokSzama;
    }

    public int getGuritasEredmenye(int i) {
         bowling.guritas(i);
         return pontokSzama+=bowling.getLevittBabukSzama();
    }
}

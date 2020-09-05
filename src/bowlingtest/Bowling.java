package bowlingtest;


public class Bowling {

    private int levittBabukSzama=0;
    private int guritasokSzama=0;

    public int getBabukSzama() {

            return 10-levittBabukSzama;


    }

    public void guritas(int i) {

        if(guritasokSzama<2){
            guritasokSzama++;
            levittBabukSzama+=i;
        }

    }
}

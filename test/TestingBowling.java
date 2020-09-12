import bowlingtest.Bowling;
import bowlingtest.BowlingPontokSzamolasa;
import org.junit.Assert;
import org.junit.Test;

public class TestingBowling {
    @Test
    public void testBowlingNumbers() {
        Bowling bowling = new Bowling();
        Assert.assertEquals(10, bowling.getBabukSzama());
        Assert.assertEquals(false, bowling.vegeVanEAKornek());

    }


    @Test
    public void testFennMaradtBabukSzama() {
        Bowling bowling = new Bowling();
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        bowling.guritas(1);
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        Assert.assertEquals(9, bowling.getBabukSzama());
    }

    @Test
    public void testFennMaradtBabukSzama1() {
        Bowling bowling = new Bowling();
        bowling.guritas(2);
        Assert.assertEquals(8, bowling.getBabukSzama());

    }

    @Test
    public void testFennMaradtBabukSzama2() {
        Bowling bowling = new Bowling();
        bowling.guritas(6);
        Assert.assertEquals(4, bowling.getBabukSzama());
    }

    @Test
    public void testFennMaradtBabukSzama3() {
        Bowling bowling = new Bowling();
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        bowling.guritas(6);
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        Assert.assertEquals(4, bowling.getBabukSzama());
        bowling.guritas(1);
        Assert.assertEquals(true, bowling.vegeVanEAKornek());
        Assert.assertEquals(3, bowling.getBabukSzama());
    }

    @Test
    public void testFennMaradtBabukSzama4() {
        Bowling bowling = new Bowling();
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        bowling.guritas(6);
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        Assert.assertEquals(4, bowling.getBabukSzama());
        bowling.guritas(1);
        Assert.assertEquals(true, bowling.vegeVanEAKornek());
        Assert.assertEquals(3, bowling.getBabukSzama());
        bowling.guritas(1);
        Assert.assertEquals(true, bowling.vegeVanEAKornek());
        Assert.assertEquals(3, bowling.getBabukSzama());
    }


    @Test
    public void testFennMaradtBabukSzama8() {
        Bowling bowling = new Bowling();
        Assert.assertEquals(false, bowling.vegeVanEAKornek());
        bowling.guritas(10);
        Assert.assertEquals(true, bowling.vegeVanEAKornek());
        Assert.assertEquals(0, bowling.getBabukSzama());
    }

    @Test
    public void testOsszesitettPontok() {
        BowlingPontokSzamolasa bowlingPontokSzamolasa = new BowlingPontokSzamolasa(1);
        Assert.assertEquals(1, bowlingPontokSzamolasa.getJatekosokSzama());


    }

    @Test
    public void testJatekosokSzama() {

        BowlingPontokSzamolasa bowlingPontokSzamolasa = new BowlingPontokSzamolasa(2);
        Assert.assertEquals(2, bowlingPontokSzamolasa.getJatekosokSzama());
        bowlingPontokSzamolasa = new BowlingPontokSzamolasa(3);
        Assert.assertEquals(3, bowlingPontokSzamolasa.getJatekosokSzama());
        bowlingPontokSzamolasa = new BowlingPontokSzamolasa(4);
        Assert.assertEquals(4, bowlingPontokSzamolasa.getJatekosokSzama());

    }
    @Test
    public void testGuritasElottiBabukSzama(){
        BowlingPontokSzamolasa bowlingPontokSzamolasa = new BowlingPontokSzamolasa(1);
        Assert.assertEquals(10, bowlingPontokSzamolasa.getGuritasElottiBabukSzama());

    }
    @Test
    public void testKezdőPontSzám(){
        BowlingPontokSzamolasa bowlingPontokSzamolasa = new BowlingPontokSzamolasa(1);
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(0));
        bowlingPontokSzamolasa = new BowlingPontokSzamolasa(2);
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(0));
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(1));
        bowlingPontokSzamolasa = new BowlingPontokSzamolasa(4);
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(0));
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(1));
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(2));
        Assert.assertEquals(0,bowlingPontokSzamolasa.getPontokSzáma(3));


    }

    @Test
    public void testGuritasEredmenye(){
        BowlingPontokSzamolasa bowlingPontokSzamolasa = new BowlingPontokSzamolasa(1);
        Assert.assertEquals(0,bowlingPontokSzamolasa.getGuritasEredmenye(0));
        bowlingPontokSzamolasa = new BowlingPontokSzamolasa(1);
        Assert.assertEquals(1,bowlingPontokSzamolasa.getGuritasEredmenye(1));

    }



}

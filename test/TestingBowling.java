import bowlingtest.Bowling;
import org.junit.Assert;
import org.junit.Test;

public class TestingBowling {
    @Test
    public void testBowlingNumbers(){
        Bowling bowling = new Bowling();
        Assert.assertEquals(10 ,bowling.getBabukSzama() );

    }


    @Test
    public void testFennMaradtBabukSzama(){
        Bowling bowling = new Bowling();
        bowling.guritas(1);
        Assert.assertEquals(9 ,bowling.getBabukSzama() );
    }

    @Test
    public void testFennMaradtBabukSzama1(){
        Bowling bowling = new Bowling();
        bowling.guritas(2);
        Assert.assertEquals(8 ,bowling.getBabukSzama() );

    }

    @Test
    public void testFennMaradtBabukSzama2(){
        Bowling bowling = new Bowling();
        bowling.guritas(6);
        Assert.assertEquals(4 ,bowling.getBabukSzama() );
    }

    @Test
    public void testFennMaradtBabukSzama3(){
        Bowling bowling = new Bowling();
        bowling.guritas(6);
        Assert.assertEquals(4 ,bowling.getBabukSzama() );
        bowling.guritas(1);
        Assert.assertEquals(3 ,bowling.getBabukSzama() );
    }

    @Test
    public void testFennMaradtBabukSzama4(){
        Bowling bowling = new Bowling();
        bowling.guritas(6);
        Assert.assertEquals(4 ,bowling.getBabukSzama() );
        bowling.guritas(1);
        Assert.assertEquals(3 ,bowling.getBabukSzama() );
        bowling.guritas(1);
        Assert.assertEquals(3 ,bowling.getBabukSzama() );
    }
}

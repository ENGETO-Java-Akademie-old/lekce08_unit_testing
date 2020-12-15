import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class KalkulackaTest {

    @Test
    @RepeatedTest(10)
    public void zakladniTest(){
        Kalkulacka kalkulacka = new Kalkulacka();

        Assertions.assertAll("nasobeni",
                ()->Assertions.assertEquals(0.0, kalkulacka.nasobeni(0.0, 0.0)),
                ()->Assertions.assertEquals(1.0, kalkulacka.nasobeni(1.0, 1.0)),
                ()->Assertions.assertEquals(0.0, kalkulacka.nasobeni(0.0, 1.0)));
    }

    @Test
    public void dalsiTest(){
        Kalkulacka kalkulacka = new Kalkulacka();

        Assertions.assertThrows(NullPointerException.class, ()->kalkulacka.nasobeni(1.0, null));
    }


}

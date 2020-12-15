import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DruhyUnitTest {

    @Test
    public void druhyTest(){

    }

//    @Test
//    public void testAssumptions(){
//        Assumptions.assumeTrue(false);
//        Assertions.assertTrue(true);
//    }

//    @Test
//    @Disabled
//    public void testAssumptionsFail(){
//        Assumptions.assumeTrue(true);
//        Assertions.assertTrue(false);
//    }

    @Test
    public void testAssumptionsPrevent(){
        Assumptions.assumeTrue(true);
        Assertions.assertTrue(true);
    }

//    @Test
//    public void testAssumptionsPreventError(){
//        Assumptions.assumeTrue(false);
//        Assertions.assertTrue(false);
//    }
}

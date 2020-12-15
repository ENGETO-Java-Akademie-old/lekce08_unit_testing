import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Prvni Unit Test - Test tridy TridaNaTest")
public class PrvniUnitTest {

    TridaNaTest tridaNaTest;

    @BeforeEach
    void initAll(){
        tridaNaTest = new TridaNaTest();
    }

    @Test
    @DisplayName("Test frameworku")
    public void prvniTest(){

    }

    @Test
    @DisplayName("Test metody checkTrue")
    public void prvniOpravdovyTest(){
        Assertions.assertTrue(tridaNaTest.checkTrue());
    }

//    @Test
//    @Disabled("Zakazano do pristi opravy")
//    public void spatnyTest(){
//        Assertions.assertFalse(tridaNaTest.checkTrue());
//    }


    @Test
    public void testSouctu(){
        tridaNaTest = new TridaNaTest();
        Assertions.assertEquals( 3, tridaNaTest.soucet(1,2));
        Assertions.assertEquals(4, tridaNaTest.soucet(1,3));
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "1,3,4"})
    public void testViceSouctu(Integer a, Integer b, Integer soucet){

        Assertions.assertEquals( soucet, tridaNaTest.soucet(a,b));

    }

    @Test
    public void testVyjimky() {
        Assertions.assertThrows(RuntimeException.class, () -> tridaNaTest.vyhodiVyjimku());
    }

}

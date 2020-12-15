import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class PodminenyTest {

    boolean prostrediSDatabazi(){
        return true;
    }

    @EnabledIf("prostrediSDatabazi")
    @Test
    public void testSDB(){
        System.out.println("Test s DB OK");
    }

    @DisabledIf("prostrediSDatabazi")
    @Test
    public void testSSouborem(){
        System.out.println("Test se Souborem OK");
    }
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class RychlostTest {

    @Test
    @Timeout(value = 1495, unit = TimeUnit.MILLISECONDS)
    public void testSpeed() throws InterruptedException {

        System.out.println(System.currentTimeMillis());
        Thread.sleep(1500L);
        System.out.println(System.currentTimeMillis());

    }
}

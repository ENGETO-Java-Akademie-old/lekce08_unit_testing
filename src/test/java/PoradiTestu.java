import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PoradiTestu {

    @Test
    @DisplayName("1 - Prvni")
    @Order(200)
    public void prvni(){
        System.out.println("Prvni");
    }

    @Test
    @DisplayName("2 - Druha")
    @Order(100)
    public void druhy(){
        System.out.println("Druhy");
    }

    @Test
    @DisplayName("3 - Treti")
    @Order(50)
    public void treti(){
        System.out.println("Treti");
    }
}

public class TridaNaTest {

    public boolean checkTrue(){
        return true;
    }

    public int soucet(int a, int b){
        return a + b;
    }

    public void vyhodiVyjimku()  {
        System.out.println("Za chvili vyhodim vyjimku RuntimeException");
        throw new RuntimeException("Tohle nebude fungovat");
    }

}

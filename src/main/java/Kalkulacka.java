public class Kalkulacka {

    public Double nasobeni(Double a, Double b){
        System.out.print(a + " * " + b + " = ");
        Double result = a * b;
        System.out.println(result);
        return result;
    }

    public Double nasobeni(Double ... prvky){
        return 0.0;
    }
}

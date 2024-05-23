
public class Kreis extends Form{


    int radius = 10;

    @Override
    public double getArea() {

        double x =  Math.PI * radius * radius;
        System.out.println(x);
        return x;
    }
}
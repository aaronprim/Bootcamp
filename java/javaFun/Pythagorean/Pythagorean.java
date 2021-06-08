import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double legC = ((legA)^2) + ((legB)^2);
        System.out.println(legC);
        double hypotenuse= Math.sqrt(legC);
        return hypotenuse;
    }
}   
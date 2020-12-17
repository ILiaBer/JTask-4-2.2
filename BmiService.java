public class BmiService {
    public double calculate(int weight,double height) {
        double imt= weight/(height*height);
        return imt;
    }
}
public class J42 {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        double imt= service.calculate(80,1.86 );
        System.out.println(imt);
    }
}

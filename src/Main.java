public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 180;
        int weight =82;
        float bodyMassIndex= (float) service.calculate (weight,height);
        System.out.println(bodyMassIndex +" кг/м2");
    }
}

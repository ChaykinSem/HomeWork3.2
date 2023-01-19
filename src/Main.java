public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BodyMassIndex = service.calculate( 60,  1.70);
        System.out.println("Индекс массы тела (60 кг, 1.70 м):" + BodyMassIndex);

    }
}

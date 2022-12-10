public class Main {
    public static void main(String[] args) {

        BmiService service= new BmiService();
        double index = service.calculate(65, 1.85);

        System.out.println("Индекс массы тела (BMI) = " + (int)index);
    }
}
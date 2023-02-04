import ru.netology.sqr.JavaHomeWork5.services.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.quantitySqrt(0, 1));
    }
}

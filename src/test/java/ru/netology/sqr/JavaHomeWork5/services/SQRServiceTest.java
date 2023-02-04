package ru.netology.sqr.JavaHomeWork5.services;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class SQRServiceTest {

   @Test
   public void shouldCalc(){
       SQRService service = new SQRService();

       int expected = 3;
       int actual = service.quantitySqrt(200, 300);

       Assertions.assertEquals(expected, actual);
   }
    @Test
    public void shouldCalcZero(){
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.quantitySqrt(0, 0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcNegative(){
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.quantitySqrt(-200, -300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcOne(){
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.quantitySqrt(0, 1);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcNegativePositive(){
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.quantitySqrt(-100, 10);

        Assertions.assertEquals(expected, actual);
    }
}

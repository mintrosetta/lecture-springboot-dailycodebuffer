package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // บอกว่า class นี้เป็น class ที่จะถูกนำไปแทรกในจุด point cut โดย spring aop
@Component // ทำให้ Aspect นี้ถูกสร้างขึ้นไว้ใน Spring Container
public class LoggingAspect {

    // ระบุ method ที่ต้องการให้ method ของเราทำงานก่อนที่ mothod ที่ระบุจะทำงาน
    // เช่น ก่อน ShoppingCart.checkout() จะทำงาน ให้เรียกใช้ logger() ก่อน
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void logger() {
        System.out.println("Loggers");
    }
}

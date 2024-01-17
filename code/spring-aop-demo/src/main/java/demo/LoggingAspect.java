package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // บอกว่า class นี้เป็น class ที่จะถูกนำไปแทรกในจุด point cut โดย spring aop
@Component // ทำให้ Aspect นี้ถูกสร้างขึ้นไว้ใน Spring Container
public class LoggingAspect {

    // ระบุ method ที่ต้องการให้ method ของเราทำงานก่อนที่ mothod ที่ระบุจะทำงาน
    // เช่น ก่อน ShoppingCart.checkout() จะทำงาน ให้เรียกใช้ logger() ก่อน
    // การใส่ .. ข้างใน () จะเป็นการบอกว่าให้เรียกใช้ method ที่มี parameter ด้วย
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforLogging(JoinPoint jp) {
        // System.out.println(jp.getSignature());
        String org = jp.getArgs()[0].toString(); // ดึง value จาก parameter
        System.out.println("befor loggers with argument: " + org);
    }

    // ใช้ *.*.checkout() เพื่อบอกว่า เพตเกจอะไรก็ได้.คลาสอะไรก็ได้.checkout()
    @After("execution(* *.*.checkout(..))")
    public void afterLogging() {
        System.out.println("after logger");
    }

    // ระบุว่าจะเพิ่ม aspect code เข้าไปที่ class หรือ method อะไร
    // ใช้เพื่อให้ advice อื่นแทนที่จะระบุ execution(* demo.ShoppingCart.quantity(..)) ซ้ำ ๆ กันไปเรื่อย ๆ ก็มาเรียกใช้ afterReturningPointCut เพื่อเอา pointcut ได้เลย
    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    // ระบุ advice หรือ ตำแหน่งของ join point ที่เราจะแทรก code เข้าไป โดยที่นี้เราอ้างอิงว่าเราจะเพิ่มเข้าไปที่ class หรือ method จาก Pointcut
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning " + retVal);
    }
}

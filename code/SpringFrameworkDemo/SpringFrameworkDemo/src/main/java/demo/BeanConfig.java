package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Annotation ที่บอก spring ว่าใช้สำหรับกำหนดค่าให้กับ Spring Container เพื่อตั้งค่า Bean
/*
    annotation สำหรับบอก spring ว่าให้เข้าไปค้นหาทุก ๆ class ที่เป็น Bean
    ใน package แล้วนำมาสร้าง instance สำหรับ referance
*/
@ComponentScan(basePackages = "demo")
public class BeanConfig {
    /*
        ใช้ระบุว่าเป็น method ที่จะสร้างและส่งคืน object ที่จะถูกจัดการโดย Spring Container และนำไปเก็บใน Spring Application Context
        ทำให้เราไม่จำเป็นต้องใช้ ComponentScan เพื่อให้ spring เข้าไปค้นหา bean เอง
    */
//    @Bean
//    public Doctor doctor() {
//        return new Doctor();
//    }
}

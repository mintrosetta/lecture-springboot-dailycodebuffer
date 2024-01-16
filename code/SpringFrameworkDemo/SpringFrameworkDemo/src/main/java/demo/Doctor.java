package demo;

import org.springframework.stereotype.Component;

@Component // เป็น annotation บอกว่า class นี้เป็น Bean เพื่อให้ spring-context นำไปสร้าง instance สำหรับ referance
public class Doctor implements Staff {
    public void assist() {
        System.out.println("Doctor is assisting!");
    }
}

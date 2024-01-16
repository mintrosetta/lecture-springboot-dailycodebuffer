package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
            XML Base Configuration
            เราจะต้องกำหนดค่าและการทำงานของ Spring Application โดยใช้ XML เป็นตัวกำหนด
            ทำให้ไม่ต้องเขียนโค้ด Java เพื่อกำหนดการทำงานหรือสร้าง Bean แต่ละตัว

            โดยการตั้งค่าจะถูกเก็บไว้ใน resource เสมอ เช่น spring.xml = resource/spring.xml
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // ดึง Bean ของ class Doctor ที่ถูกสร้างโดย spring-context
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());

        Staff nurse = context.getBean(Nurse.class);
        nurse.assist();
    }
}

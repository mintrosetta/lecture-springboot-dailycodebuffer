package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
            Annotation Config
            เราจะต้องกำหนดค่าและการทำงานของ Spring Application โดยใช้ Annotation เป็นตัวกำหนด
        */
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        // ดึง Bean ของ class Doctor ที่ถูกสร้างโดย spring-context
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor.toString());

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1.toString());
    }
}

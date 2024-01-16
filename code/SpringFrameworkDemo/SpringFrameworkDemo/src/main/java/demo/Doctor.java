package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // เป็น annotation บอกว่า class นี้เป็น Bean เพื่อให้ spring-context นำไปสร้าง instance สำหรับ referance
@Scope(scopeName = "prototype") // ใช้เพื่อกำหนด scope ของ class bean โดย pr
public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    public void assist() {
        System.out.println("Doctor is assisting!");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Docter bean has called");
    }
}

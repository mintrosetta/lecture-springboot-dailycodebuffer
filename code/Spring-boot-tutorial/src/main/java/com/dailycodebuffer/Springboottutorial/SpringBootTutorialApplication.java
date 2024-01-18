package com.dailycodebuffer.Springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Annotation ของ spring boot เพื่อรวบรวม config ต่าง ๆ ให้กับเรา
public class SpringBootTutorialApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}
}

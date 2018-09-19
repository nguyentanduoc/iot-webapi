package vn.ctu.thud.ntd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IoTApiApp extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(IoTApiApp.class)
        .run(args);
	}
	
}

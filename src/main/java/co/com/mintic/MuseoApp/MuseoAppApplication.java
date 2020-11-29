package co.com.mintic.MuseoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuseoAppApplication {

	public static void main(String[] args) {
            new MuseoFrame().setVisible(true);
            SpringApplication.run(MuseoAppApplication.class, args);
	}

}

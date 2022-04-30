package disburse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import config.HouseDisburseConfig;

@SpringBootApplication
public class HouseDisburseDetailApp {

	public static void main(String[] args) {
		SpringApplication.run(HouseDisburseConfig.class);

	}

}

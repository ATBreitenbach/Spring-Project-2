package IS296.P2_2013Q4_House_Disburse_JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import config.HouseDisburseConfig;

@SpringBootApplication
public class P22013Q4HouseDisburseJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseDisburseConfig.class);
	}

}

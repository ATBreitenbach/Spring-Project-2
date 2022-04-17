package IS296.P2_2013Q4_House_Disburse_JdbcTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import config.HouseDisburseConfig;

@SpringBootApplication
public class P22013Q4HouseDisburseJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseDisburseConfig.class);
	}

}

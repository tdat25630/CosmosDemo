package cosmos_test.azure_cosmos_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "cosmos_test.azure_cosmos_demo.Repository")
public class AzureCosmosDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureCosmosDemoApplication.class, args);
	}

}

package cosmos_test.azure_cosmos_demo.config;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.data.cosmos.CosmosFactory;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.core.CosmosTemplate;
import com.azure.spring.data.cosmos.core.convert.MappingCosmosConverter;
import lombok.Value;
import org.springframework.context.annotation.Bean;

public class CosmosConfig extends AbstractCosmosConfiguration {


    private String cosmosUri = "https://localhost:8081";


    private String cosmosKey = "C2y6yDjf5/R+ob0N8A7Cgv30VRDJIWEHLM+4QDU5DE2nQ9nDuVTqobD4b8mGGyPMbIZnqyMsEcaGQy67XIw/Jw==";

    private String cosmosDatabase = "SampleDB";

    @Bean
    public CosmosAsyncClient cosmosAsyncClient() {
        return new CosmosClientBuilder()
                .endpoint(cosmosUri)
                .key(cosmosKey)
                .buildAsyncClient();
    }

    @Bean
    public CosmosTemplate cosmosTemplate(CosmosFactory cosmosFactory, MappingCosmosConverter mappingCosmosConverter) {
        return new CosmosTemplate(cosmosFactory, this.cosmosConfig(), mappingCosmosConverter); // Use "this" for CosmosConfig
    }

    @Override
    protected String getDatabaseName() {
        return cosmosDatabase;
    }


}

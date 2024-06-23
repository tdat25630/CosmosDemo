package cosmos_test.azure_cosmos_demo.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import cosmos_test.azure_cosmos_demo.Entity.User;

import java.util.Optional;



import com.azure.spring.data.cosmos.repository.CosmosRepository;
import cosmos_test.azure_cosmos_demo.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends CosmosRepository<User,String> {
    void deleteById(String id);

    User save(User user);

    Object findAll();

    User findById(String id);
}


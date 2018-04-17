package hello;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
public interface MessageRepository extends MongoRepository<MessageMe, String>{

    //List<MessageMe> findAll(@Param("sender") String sender);
    List<MessageMe> findBySender(@Param("sender") String sender);
}

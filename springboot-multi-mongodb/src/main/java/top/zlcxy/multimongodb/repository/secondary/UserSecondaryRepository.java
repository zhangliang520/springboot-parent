package top.zlcxy.multimongodb.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.zlcxy.multimongodb.domain.User;

public interface UserSecondaryRepository extends MongoRepository<User, Long> {
}

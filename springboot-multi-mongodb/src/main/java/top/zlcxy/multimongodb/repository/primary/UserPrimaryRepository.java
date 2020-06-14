package top.zlcxy.multimongodb.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.zlcxy.multimongodb.domain.User;

public  interface UserPrimaryRepository extends MongoRepository<User, Long> {

}

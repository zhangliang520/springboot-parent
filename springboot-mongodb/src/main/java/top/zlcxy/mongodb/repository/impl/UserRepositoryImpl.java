package top.zlcxy.mongodb.repository.impl;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import top.zlcxy.mongodb.domain.User;
import top.zlcxy.mongodb.repository.UserRepository;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public long saveUser(User user) {
        return mongoTemplate.save(user) != null ? 1 : 0;
    }


    @Override
    public User findUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }


    @Override
    public long updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("userName", user.getUserName()).set("passWord", user.getPassWord());
        //更新查询返回结果集的第一条
        UpdateResult result = mongoTemplate.updateFirst(query, update, User.class);
        return result != null ? result.getMatchedCount() : 0;

    }


    @Override
    public long deleteUserById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        DeleteResult result = mongoTemplate.remove(query, User.class);
        return result != null ? result.getDeletedCount() : 0;
    }
}

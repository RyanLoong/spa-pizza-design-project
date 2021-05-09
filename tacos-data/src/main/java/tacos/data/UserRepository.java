package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.User;

/**
 * @author RyanLoong
 * @Date 2021/5/9 15:44
 * @Classname UserRepository
 * @Description user持久化操作的接口
 */
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * 通过用户名查找用户
     * @param username 用户名
     * @return 返回到用户中
     */
    User findByUsername(String username);

}


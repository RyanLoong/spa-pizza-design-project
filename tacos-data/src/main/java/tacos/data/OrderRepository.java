package tacos.data;


import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.Order;
import tacos.User;

import java.util.List;

/**
 * @author RyanLoong
 * @Date 2021/5/9 15:40
 * @Classname OrderRepository
 * @Description 对于order对象的持久化操作接口
 */
public interface OrderRepository extends CrudRepository<Order, String> {

    /**
     * 查找指定用户的订单，并通过指定的分页方式查询，查询结果返回到一个List集合中
     * @param user 指定用户
     * @param pageable 分页对象
     * @return 返回一个订单集合
     */
    List<Order> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);

}

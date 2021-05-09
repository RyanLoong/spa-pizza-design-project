package tacos.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import tacos.Taco;

/**
 * @author RyanLoong
 * @Date 2021/5/9 15:42
 * @Classname TacoRepository
 * @Description 对于taco操作的接口
 * PagingAndSortingRepository 接口继承于 CrudRepository 接口，
 * 拥有CrudRepository 接口的所有方法， 并新增两个功能：分页和排序。
 * 但是这两个方法不能包含筛选条件。
 */
public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}

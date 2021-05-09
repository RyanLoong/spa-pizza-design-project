package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

/**
 * @author RyanLoong
 * @Date 2021/5/9 15:37
 * @Classname IngredientRepository
 * @Description 配料的持久化接口
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

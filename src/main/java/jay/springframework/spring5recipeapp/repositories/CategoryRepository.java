package jay.springframework.spring5recipeapp.repositories;

import jay.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

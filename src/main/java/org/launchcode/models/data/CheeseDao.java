package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
/* this tells spring that this interface is a repository and it should manage it for us, creates a concrete class
that implements this interface
 */
@Transactional
/* all of the methods of this interface should be wrapped by a dataabase interaction

 */
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
}

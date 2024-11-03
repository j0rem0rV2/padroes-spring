package car.project.padrao_spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends  CrudRepository <Car, Long>{

}

package isdb.courseback.repository;

import isdb.courseback.model.DeliveryAuto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryAutoRepository extends CrudRepository<DeliveryAuto, Long> {

    @Query("SELECT minerId FROM DeliveryAuto")
    List<Integer> findAllMinerId();

}

package isdb.courseback.repository;

import isdb.courseback.model.DeliveryEquipment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryEquipmentRepository extends CrudRepository<DeliveryEquipment, Long> {

    @Query("SELECT minerId FROM DeliveryEquipment")
    List<Integer> findAllMinerId();

}

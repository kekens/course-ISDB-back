package isdb.courseback.repository;

import isdb.courseback.model.Brigade;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BrigadeRepository extends CrudRepository<Brigade, Long> {

    Optional<Brigade> findByForemanId(int foremanId);

}

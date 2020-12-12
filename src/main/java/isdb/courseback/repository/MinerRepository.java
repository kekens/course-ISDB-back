package isdb.courseback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import isdb.courseback.model.Miner;

import java.util.Optional;

@Repository
public interface MinerRepository extends CrudRepository<Miner, Long> {

    Optional<Miner> findByMinerId(int id);

}

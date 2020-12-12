package isdb.courseback.repository;

import isdb.courseback.model.BrigadeRecord;
import isdb.courseback.model.Miner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BrigadeRecordRepository extends CrudRepository<BrigadeRecord, Long> {

    Optional<BrigadeRecord> findByMinerId(int id);

}

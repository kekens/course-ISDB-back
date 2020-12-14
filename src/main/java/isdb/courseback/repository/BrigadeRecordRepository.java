package isdb.courseback.repository;

import isdb.courseback.model.BrigadeRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface BrigadeRecordRepository extends CrudRepository<BrigadeRecord, Long> {

    Optional<BrigadeRecord> findByMinerId(int id);

    List<BrigadeRecord> findAllByBrigadeIdAndMinerIdNotIn(int id, Collection<Integer> deliveryEquipMinerId);

    List<BrigadeRecord> findAllByBrigadeId(int id);

}

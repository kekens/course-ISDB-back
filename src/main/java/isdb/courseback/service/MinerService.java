package isdb.courseback.service;

import isdb.courseback.model.Miner;
import isdb.courseback.repository.MinerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MinerService {

    private MinerRepository minerRepository;

    @Autowired
    public MinerService(MinerRepository minerRepository) {
        this.minerRepository = minerRepository;
    }

    public Optional<Miner> showMiner(int id) {
        return minerRepository.findByMinerId(id);
    }

}

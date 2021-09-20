package isdb.courseback.service;

import isdb.courseback.model.Magazine;
import isdb.courseback.repository.BrigadeRecordRepository;
import isdb.courseback.repository.MagazineRepository;
import isdb.courseback.repository.MinerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazineService {
        private MagazineRepository magazineRepository;
        private BrigadeRecordRepository brigadeRecordRepository;
        private MinerRepository minerRepository;

        @Autowired
        public MagazineService(MagazineRepository magazineRepository, MinerRepository minerRepository, BrigadeRecordRepository brigadeRecordRepository){
                this.magazineRepository = magazineRepository;
                this.minerRepository = minerRepository;
                this.brigadeRecordRepository = brigadeRecordRepository;
        }
        public List<Magazine> showMinerMagazine(int id) {
                System.out.println(magazineRepository.findAllMagazineByMinerId(id));
                return magazineRepository.findAllMagazineByMinerId(id);
        }

        public Magazine addMagazineRecord(Magazine magazine){
                magazine.setMinerId(magazine.getMinerId());
                magazine.setMineName(magazine.getMineName());
                magazine.setBrigadeId(magazine.getBrigadeId());
                magazine.setPart(magazine.getPart());
                magazine.setDateWork(magazine.getDateWork());
                magazine.setRating(magazine.getRating());
                magazineRepository.save(magazine);
                printMagazineRecord(magazine);
                return magazine;
        }

        private void printMagazineRecord(Magazine magazine) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println(magazine);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

}

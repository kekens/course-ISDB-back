package isdb.courseback.service;

import isdb.courseback.dto.MinerPartResponse;
import isdb.courseback.model.BrigadeRecord;
import isdb.courseback.repository.BrigadeRecordRepository;
import isdb.courseback.repository.MinerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagingService {

    private MinerRepository minerRepository;
    private BrigadeRecordRepository brigadeRecordRepository;


    @Autowired
    public ManagingService(MinerRepository minerRepository,  BrigadeRecordRepository brigadeRecordRepository){
        this.minerRepository = minerRepository;
        this.brigadeRecordRepository = brigadeRecordRepository;
    }

    public List<MinerPartResponse> showManagingByBrigadeId(int brigadeId) {

        List<BrigadeRecord> brigadeRecords = brigadeRecordRepository.findAllByBrigadeId(brigadeId);
        System.out.println("================================================================================");
        System.out.println(brigadeRecords);
        System.out.println("================================================================================");

        List<MinerPartResponse> minerDeliveryResponseList = new ArrayList<MinerPartResponse>();
        for (BrigadeRecord brigadeRec:
                brigadeRecords)
        {
            minerDeliveryResponseList.add(MinerPartResponse.builder()
                    .minerId(brigadeRec.getMinerId())
                    .name(minerRepository.findNameByMinerId(brigadeRec.getMinerId()))
                    .part(brigadeRec.getPart())
                    .build());
        }
        return minerDeliveryResponseList;
    }

    public void deleteBrigadeRecord(int minerId){
        brigadeRecordRepository.deleteByMinerId(minerId);
    }


}

package isdb.courseback.service;

import isdb.courseback.model.Schedule;
import isdb.courseback.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> showAllSchedule(int brigadeId) {
        List<Schedule> scheduleList = scheduleRepository.findAllByBrigadeId(brigadeId);
        System.out.println(scheduleList.get(0).getWorkDate());
        return scheduleRepository.findAllByBrigadeId(brigadeId);
    }

}

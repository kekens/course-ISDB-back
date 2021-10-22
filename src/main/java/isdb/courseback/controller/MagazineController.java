package isdb.courseback.controller;


import java.util.List;

import isdb.courseback.dto.MinerPartResponse;
import isdb.courseback.model.Magazine;
import isdb.courseback.service.MagazineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/magazine")
public class MagazineController {

    private MagazineService magazineService;

    @Autowired
    public MagazineController(MagazineService magazineService) {
        this.magazineService = magazineService;
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<List<Magazine>> showMinerMagazine(@PathVariable @RequestBody int id) {
        return new ResponseEntity<>(magazineService.showMinerMagazine(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Magazine> addMagazine(@RequestBody Magazine magazine) {
            return new ResponseEntity<>(magazineService.addMagazine(magazine), HttpStatus.OK);
    }

    @GetMapping("/br/{brigadeId}")
    public ResponseEntity<List<MinerPartResponse>> showManagingBrigadeId(@PathVariable @RequestBody int brigadeId){
        log.info("--------------------------------------------------------------------------------------------------------");
        log.info("\n");
        log.info("--------------------------------------------------------------------------------------------------------");
        return new ResponseEntity<>(magazineService.showManagingBrigadeId(brigadeId), HttpStatus.OK);
    }
}

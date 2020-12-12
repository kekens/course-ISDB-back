package isdb.courseback.controller;

import isdb.courseback.model.Miner;
import isdb.courseback.service.MinerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/miner")
public class MinerController {

    private MinerService minerService;

    @Autowired
    public MinerController(MinerService minerService) {
        this.minerService = minerService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Miner>> showMiner(@PathVariable @RequestBody int id) {
        return new ResponseEntity<>(minerService.showMiner(id), HttpStatus.OK);
    }
}

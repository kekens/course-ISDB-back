package isdb.courseback.controller;

import isdb.courseback.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/delivery")
public class DeliveryController {

    private DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/do/{minerId}")
    public ResponseEntity<String> addDelivering(@PathVariable @RequestBody int minerId) {
        String error = this.deliveryService.doDelivery(minerId);
        if (error.equals("")) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }
}

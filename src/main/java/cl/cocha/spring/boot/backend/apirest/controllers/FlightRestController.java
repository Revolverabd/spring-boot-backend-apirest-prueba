package cl.cocha.spring.boot.backend.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.cocha.spring.boot.backend.apirest.models.dto.FlightRequest;
import cl.cocha.spring.boot.backend.apirest.services.interfaces.IFlightService;

@RestController
@RequestMapping("/api")
public class FlightRestController {

    @Autowired
    IFlightService iFlightService;

    @GetMapping(value = "/flights", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> showAllFlights() {
        return ResponseEntity.ok(this.iFlightService.getdAllFlight());
    }

    @PostMapping(value = "/flight/by/{suplierId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> showFlightByid(@PathVariable("suplierId") String suplierId) {
        return ResponseEntity.ok(this.iFlightService.getBySuplierId(suplierId));
    }

    @PostMapping(value = "/flight/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createFlight(@RequestBody FlightRequest request) {
        this.iFlightService.saveFlight(request);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @DeleteMapping(value = "/flight/delete/{flightId}")
    public ResponseEntity<Object> deleteFlightById(@PathVariable("flightId") Long flightId) {
        this.iFlightService.deleteFlightById(flightId);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PutMapping(value = "/flight/update/{flightId}")
    public ResponseEntity<Object> updateFlight(@RequestBody FlightRequest request, @PathVariable Long flightId){
        this.iFlightService.updateFlight(request,flightId);
        return ResponseEntity.ok(Boolean.TRUE);
    }

}

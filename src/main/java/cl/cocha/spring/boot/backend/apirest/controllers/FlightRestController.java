package cl.cocha.spring.boot.backend.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 
     * 
     * 
     * @PostMapping("/flight")
     * 
     * @ResponseStatus(value = HttpStatus.CREATED) public Flight
     *                       createFlight(@RequestBody Flight flight) { return
     *                       flightService.saveFlight(flight); }
     * 
     *                       @PutMapping("/flight/{id}")
     * @ResponseStatus(value = HttpStatus.CREATED) public Flight
     *                       updateFlightById(@RequestBody Flight
     *                       flight, @PathVariable Long id) {
     * 
     *                       Flight currentFlight = flightService.getFlightById(id);
     * 
     *                       currentFlight.setTitle(flight.getTitle());
     *                       currentFlight.setDescription(flight.getDescription());
     *                       currentFlight.setImage(flight.getImage());
     *                       currentFlight.setStartDate(flight.getStartDate());
     *                       currentFlight.setStartDate(flight.getEndDate());
     * 
     * 
     *                       return flightService.saveFlight(currentFlight);
     * 
     *                       }
     * 
     **                       @DeleteMapping("/flight/{id}")
     * @ResponseStatus(value = HttpStatus.NO_CONTENT) public void
     *                       deleteFlight(@PathVariable Long id){
     *                       flightService.deleteFlightById(id); }
     */

}

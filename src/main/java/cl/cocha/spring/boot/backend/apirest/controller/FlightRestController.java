package cl.cocha.spring.boot.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.cocha.spring.boot.backend.apirest.model.entity.Flight;
import cl.cocha.spring.boot.backend.apirest.service.IFlightService;

@RestController
@RequestMapping("/api")
public class FlightRestController {

    @Autowired
    private IFlightService flightService;

    @GetMapping("/flight")
    public List<Flight> index() {
        return flightService.getdAllFlight();
    }

    @GetMapping("/flight/{id}")
    public Flight showFlightByid(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @PostMapping("/flight")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }
    
    @PutMapping("/flight/{id}")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Flight updateFlightById(@RequestBody Flight flight, @PathVariable Long id) {
        
        Flight currentFlight = flightService.getFlightById(id);
        
        currentFlight.setTitle(flight.getTitle());
        currentFlight.setDescription(flight.getDescription());
        currentFlight.setImage(flight.getImage());
        currentFlight.setStartDate(flight.getStartDate());
        currentFlight.setStartDate(flight.getEndDate());
        
        
        return flightService.saveFlight(currentFlight);
        
    }
    
    @DeleteMapping("/flight/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlightById(id);
    }


}

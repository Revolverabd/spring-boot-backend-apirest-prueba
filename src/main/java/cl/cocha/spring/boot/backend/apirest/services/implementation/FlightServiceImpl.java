package cl.cocha.spring.boot.backend.apirest.services.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.cocha.spring.boot.backend.apirest.helpers.ModelHelper;
import cl.cocha.spring.boot.backend.apirest.models.dto.FlightDTO;
import cl.cocha.spring.boot.backend.apirest.models.dto.FlightRequest;
import cl.cocha.spring.boot.backend.apirest.models.entities.Flight;
import cl.cocha.spring.boot.backend.apirest.repository.IFlightRepository;
import cl.cocha.spring.boot.backend.apirest.services.interfaces.IFlightService;

@Component
public class FlightServiceImpl implements IFlightService {

    @Autowired
    private IFlightRepository iFlightRepository;

    @Override
    public List<FlightDTO> getdAllFlight() {

        List<FlightDTO> flightDtoList = new ArrayList<>();
        Iterable<Flight> flights = this.iFlightRepository.findAll();

        for (Flight flight : flights) {

            FlightDTO flightDTO = ModelHelper.modelMapper().map(flight, FlightDTO.class);

            flightDtoList.add(flightDTO);
        }

        return flightDtoList;
    }

    @Override
    public FlightDTO getBySuplierId(String suplierId) {

        Optional<Flight> flight = this.iFlightRepository.findBySuplierId(suplierId);

        if (!flight.isPresent()) {
            return null;
        }

        return ModelHelper.modelMapper().map(flight.get(), FlightDTO.class);
    }

    @Override
    public void saveFlight(FlightRequest flightData) {

        Flight flight = ModelHelper.modelMapper().map(flightData, Flight.class);
        this.iFlightRepository.saveAndFlush(flight);

    }

    @Override
    public void updateFlight(FlightRequest flightData, Long flightId) {
     
        Optional<Flight> flightDB = this.iFlightRepository.findById(flightId);

        Flight flight = flightDB.get();

        flight.setSuplierId(flightData.getSuplierId());
        flight.setTitle(flightData.getTitle());
        flight.setDescription(flightData.getDescription());
        flight.setImage(flightData.getImage());
        flight.setStartDate(flightData.getStartDate());
        flight.setEndDate(flightData.getEndDate());

        this.iFlightRepository.saveAndFlush(flight);

    }
    
    @Override
    public void deleteFlightById(Long flightId) {
        this.iFlightRepository.deleteById(flightId);
    }

}
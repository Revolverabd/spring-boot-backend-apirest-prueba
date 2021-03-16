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
    public void saveAllFlight(List<FlightRequest> flights) {

    }

    @Override
    public void deleteFlightById(int flightId) {

    }

    // private FlightDTO convertToFlightDTO(final Flight flight) {
    // return ModelHelper.modelMapper().map(flight, FlightDTO.class);
    // }

}
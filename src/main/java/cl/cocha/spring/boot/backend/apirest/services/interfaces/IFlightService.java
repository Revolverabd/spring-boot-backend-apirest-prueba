package cl.cocha.spring.boot.backend.apirest.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.cocha.spring.boot.backend.apirest.models.dto.FlightDTO;
import cl.cocha.spring.boot.backend.apirest.models.dto.FlightRequest;

@Service
public interface IFlightService {

	public List<FlightDTO> getdAllFlight();

	public FlightDTO getBySuplierId(String suplierId);

	public void saveFlight(FlightRequest flight);

	public void deleteFlightById(Long flightId);

}

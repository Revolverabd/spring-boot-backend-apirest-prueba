package cl.cocha.spring.boot.backend.apirest.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.cocha.spring.boot.backend.apirest.models.dto.FlightDTO;

@Service
public interface IFlightService {

	public List<FlightDTO> getdAllFlight();

	public FlightDTO getBySuplierId(String suplierId);

	public void save(FlightDTO flight);

	public void saveAllFlight(List<FlightDTO> flights);

	public void deleteFlightById(int flightId);

}

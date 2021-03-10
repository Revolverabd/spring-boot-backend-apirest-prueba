package cl.cocha.spring.boot.backend.apirest.model.service;

import java.util.List;

import cl.cocha.spring.boot.backend.apirest.model.entity.Flight;

public interface IFlightService {

	public List<Flight> getdAllFlight();

	public Flight getFlightById(Long suplierId);

	public Flight saveFlight(Flight flight);

	public void deleteFlightById(Long suplierId);

}

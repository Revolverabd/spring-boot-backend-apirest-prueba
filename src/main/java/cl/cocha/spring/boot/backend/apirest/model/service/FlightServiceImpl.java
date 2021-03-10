package cl.cocha.spring.boot.backend.apirest.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.cocha.spring.boot.backend.apirest.model.dao.IFlightDao;
import cl.cocha.spring.boot.backend.apirest.model.entity.Flight;

@Service
public class FlightServiceImpl implements IFlightService {

    @Autowired
    private IFlightDao flightDao;

    @Override
    @Transactional(readOnly = true)
    public List<Flight> getdAllFlight() {
        return (List<Flight>) flightDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Flight getFlightById(Long id) {
        return flightDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Flight saveFlight(Flight flight) {
        return flightDao.save(flight);
    }

    @Override
    @Transactional
    public void deleteFlightById(Long id) {
        flightDao.deleteById(id);
    }

}
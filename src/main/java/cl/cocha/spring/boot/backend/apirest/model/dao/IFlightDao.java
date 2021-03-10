package cl.cocha.spring.boot.backend.apirest.model.dao;

import org.springframework.data.repository.CrudRepository;

import cl.cocha.spring.boot.backend.apirest.model.entity.Flight;



public interface IFlightDao extends CrudRepository<Flight, Long>{

  

}

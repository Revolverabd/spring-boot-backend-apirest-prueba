package cl.cocha.spring.boot.backend.apirest.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.cocha.spring.boot.backend.apirest.models.entities.Flight;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long> {

    @Transactional(readOnly = true)
    public Optional<Flight> findBySuplierId(String suplierId);

 

}

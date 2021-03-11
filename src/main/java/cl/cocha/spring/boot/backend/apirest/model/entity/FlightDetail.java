package cl.cocha.spring.boot.backend.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "flights_details")
public class FlightDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_detail_id")
    private Long flightDetailId;

    private Boolean national;

    private String validatorAirline;

 

    public Long getFlightDetailId() {
        return flightDetailId;
    }

    public void setFlightDetailId(Long flightDetailId) {
        this.flightDetailId = flightDetailId;
    }

    public Boolean getNational() {
        return national;
    }

    public void setNational(Boolean national) {
        this.national = national;
    }

    public String getValidatorAirline() {
        return validatorAirline;
    }

    public void setValidatorAirline(String validatorAirline) {
        this.validatorAirline = validatorAirline;
    }



}
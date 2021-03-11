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
    private Long flightDetail_id;

    private Boolean national;
    private String validatorAirline;

    @Column(name = "flight_id")
    private Long flightId;






    
    public Long getFlightDetail_id() {
        return flightDetail_id;
    }

    public void setFlightDetail_id(Long flightDetail_id) {
        this.flightDetail_id = flightDetail_id;
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

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    
}
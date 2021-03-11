package cl.cocha.spring.boot.backend.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "origins_destinations")
public class OriginDestination {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="origin_destination_id")
    private Long originDestinationId;

    @Column(name="city_name")
    private String cityName;            
    
    @Column(name="city_code")
    private String cityCode;            
    
    @Column(name="country_name")
    private String countryName;         
    
    @Column(name="contry_code")
    private String contryCode;          
    
    @Column(name="airport_name")
    private String airportName;         
    
    @Column(name="airport_code")
    private String airportCode;




    public Long getOriginDestinationId() {
        return originDestinationId;
    }

    public void setOriginDestinationId(Long originDestinationId) {
        this.originDestinationId = originDestinationId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContryCode() {
        return contryCode;
    }

    public void setContryCode(String contryCode) {
        this.contryCode = contryCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }         


    

}

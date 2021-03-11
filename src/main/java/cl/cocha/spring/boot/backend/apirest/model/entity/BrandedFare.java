package cl.cocha.spring.boot.backend.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branded_Fares")
public class BrandedFare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branded_fare_id")
    private Long brandedFareId;

    private String code;
    
    private String type;
    
    private String name;
    
    private String allow;
    
    private String description;
    
    private String details;
    
    private Float price;

    public Long getBrandedFareId() {
        return brandedFareId;
    }

    public void setBrandedFareId(Long brandedFareId) {
        this.brandedFareId = brandedFareId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllow() {
        return allow;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
    
}

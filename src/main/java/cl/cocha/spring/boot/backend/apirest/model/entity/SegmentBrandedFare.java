package cl.cocha.spring.boot.backend.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "segment_banded_fares")
public class SegmentBrandedFare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "segment_branded_fare_id")
    private Long segmentBrandedFareId;
    
    @Column(name = "segment_id")
    private Long segmentId;            
    
    @Column(name = "branded_fare_id")
    private Long brandedFareId;

    public Long getSegmentBrandedFareId() {
        return segmentBrandedFareId;
    }

    public void setSegmentBrandedFareId(Long segmentBrandedFareId) {
        this.segmentBrandedFareId = segmentBrandedFareId;
    }

    public Long getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public Long getBrandedFareId() {
        return brandedFareId;
    }

    public void setBrandedFareId(Long brandedFareId) {
        this.brandedFareId = brandedFareId;
    }        
    
    
}

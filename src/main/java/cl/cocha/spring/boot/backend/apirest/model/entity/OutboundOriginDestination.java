package cl.cocha.spring.boot.backend.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "outbounds_origins_destinations")
public class OutboundOriginDestination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="out_bound_origin_destination_id")
    private long outBoundOriginDestinationId;

    @Column(name="out_bound_id")
    private Long outBoundId;          
    
    @Column(name="origin_destination_id")
    private Long originDestinationId;

    private String type;



    

    public long getOutBoundOriginDestinationId() {
        return outBoundOriginDestinationId;
    }

    public void setOutBoundOriginDestinationId(long outBoundOriginDestinationId) {
        this.outBoundOriginDestinationId = outBoundOriginDestinationId;
    }

    public Long getOutBoundId() {
        return outBoundId;
    }

    public void setOutBoundId(Long outBoundId) {
        this.outBoundId = outBoundId;
    }

    public Long getOriginDestinationId() {
        return originDestinationId;
    }

    public void setOriginDestinationId(Long originDestinationId) {
        this.originDestinationId = originDestinationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }                
    
}

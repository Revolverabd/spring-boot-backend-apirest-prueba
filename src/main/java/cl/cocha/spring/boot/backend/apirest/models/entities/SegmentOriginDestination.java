package cl.cocha.spring.boot.backend.apirest.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "segments_origins_destinations")
public class SegmentOriginDestination {

    @Id
    @Column(name = "segment_origin_destination_id")
    private Long segmentOriginDestinationId;

    @Column(name = "segment_id")
    private String segmentId;

    @Column(name = "origin_destination_id")
    private String originDestinationId;

    private String type;

    public Long getSegmentOriginDestinationId() {
        return segmentOriginDestinationId;
    }

    public void setSegmentOriginDestinationId(Long segmentOriginDestinationId) {
        this.segmentOriginDestinationId = segmentOriginDestinationId;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public String getOriginDestinationId() {
        return originDestinationId;
    }

    public void setOriginDestinationId(String originDestinationId) {
        this.originDestinationId = originDestinationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

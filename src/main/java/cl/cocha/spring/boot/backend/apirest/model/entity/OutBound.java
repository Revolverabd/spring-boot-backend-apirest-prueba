package cl.cocha.spring.boot.backend.apirest.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "out_bounds")
public class OutBound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "out_bound_id")
    private Long outBoundId;

    @Temporal(TemporalType.DATE)
    private Date departure;

    @Temporal(TemporalType.DATE)
    private Date arrival;

    @Temporal(TemporalType.TIME)
    @Column(name = "total_duration")
    private Date totalDuration;

    //RELACIONES DE ENTIDADES

 






    public Long getOutBoundId() {
        return outBoundId;
    }

    public void setOutBoundId(Long outBoundId) {
        this.outBoundId = outBoundId;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Date totalDuration) {
        this.totalDuration = totalDuration;
    }



}

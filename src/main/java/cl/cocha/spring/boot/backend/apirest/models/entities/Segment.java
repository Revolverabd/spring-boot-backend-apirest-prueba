package cl.cocha.spring.boot.backend.apirest.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "segments")
public class Segment {

    @Id
    @Column(name = "segment_id")
    private Long segmentId;

    @Column(name = "airline_name")
    private String airlineName;

    @Column(name = "marketer_airline")
    private String marketerAirline;

    @Column(name = "flight_number")
    private String flightNumber;

    private String equipment;

    @Temporal(TemporalType.DATE)
    private Date arrival;

    @Temporal(TemporalType.DATE)
    private Date departure;

    @Temporal(TemporalType.TIME)
    private Date duration;

    private String airline;

    @Column(name = "days_past")
    private Integer daysPast;

    @Column(name = "type_way")
    private String typeWay;

    @Column(name = "cabin_type")
    private String cabinType;

    @Column(name = "class_type")
    private String classType;

    @Column(name = "out_bound_id")
    private Long outBoundId;

    public Long getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getMarketerAirline() {
        return marketerAirline;
    }

    public void setMarketerAirline(String marketerAirline) {
        this.marketerAirline = marketerAirline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getDaysPast() {
        return daysPast;
    }

    public void setDaysPast(Integer daysPast) {
        this.daysPast = daysPast;
    }

    public String getTypeWay() {
        return typeWay;
    }

    public void setTypeWay(String typeWay) {
        this.typeWay = typeWay;
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Long getOutBoundId() {
        return outBoundId;
    }

    public void setOutBoundId(Long outBoundId) {
        this.outBoundId = outBoundId;
    }

}

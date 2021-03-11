package cl.cocha.spring.boot.backend.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "deplinks")
public class Deeplink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deeplink_id")
    private Long deeplinkId;

    // private String flightId;
    private String backoffice;

    @Column(name = "public")
    private String publicc;

    @Column(name = "flight_id")
    private Long flightId;

/*
  * @ManyToOne
  * @JoinColumn(name = "flight_Id") 
    Flight flight;
*/    

    public Long getDeeplinkId() {
        return deeplinkId;
    }

    public void setDeeplinkId(Long deeplinkId) {
        this.deeplinkId = deeplinkId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getBackoffice() {
        return backoffice;
    }

    public void setBackoffice(String backoffice) {
        this.backoffice = backoffice;
    }

    public String getPublicc() {
        return publicc;
    }

    public void setPublicc(String publicc) {
        this.publicc = publicc;
    }

}

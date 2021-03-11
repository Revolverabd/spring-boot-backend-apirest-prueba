package cl.cocha.spring.boot.backend.apirest.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deplinks")
public class Deeplink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deeplink_id")
    private Long deeplinkId;

    private String backoffice;

    @Column(name = "public")
    private String publicc;

    // RELACIONES DE ENTIDADES
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "flight_id")
    private List<Flight> flight;


    // GETTER AND SETTER

 

    public Long getDeeplinkId() {
        return deeplinkId;
    }

    public void setDeeplinkId(Long deeplinkId) {
        this.deeplinkId = deeplinkId;
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

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

   



}

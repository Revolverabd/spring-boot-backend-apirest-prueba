package cl.cocha.spring.boot.backend.apirest.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deplinks")
public class Deeplink implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deeplink_id")
    private Long deeplinkId;

    private String backoffice;

    @Column(name = "public")
    private String publicc;

/**
 @OneToOne
 @JoinColumn(name = "flight_id", updatable = false, nullable = false)
 private Flight flight;
 * 
 */




    
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

}

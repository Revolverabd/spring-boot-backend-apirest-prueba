package cl.cocha.spring.boot.backend.apirest.models.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class FlightDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1953166326319327673L;

    private String suplierId;

    private String title;

    private String description;

    private String image;

    private Date startDate;

    private Date endDate;

}

package cl.cocha.spring.boot.backend.apirest.models.entities;

import java.io.Serializable;
import java.util.Date;

// import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "flights")
public class Flight implements Serializable {



	/**
	 *
	 */
	private static final long serialVersionUID = -5036447751795671544L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private Long fligthId;

	@Column(name = "suplier_id")
	private String suplierId;

	private String title;

	private String description;

	private String image;

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date endDate;



/**
 
	 @OneToOne(mappedBy = "flight", cascade = CascadeType.ALL)
	 private Deeplink deeplink;
 * 
 */





	public Long getFligthId() {
		return fligthId;
	}

	public void setFligthId(Long fligthId) {
		this.fligthId = fligthId;
	}

	public String getSuplierId() {
		return suplierId;
	}

	public void setSuplierId(String suplierId) {
		this.suplierId = suplierId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	// public Deeplink getDeeplink() {
	// 	return deeplink;
	// }

	// public void setDeeplink(Deeplink deeplink) {
	// 	this.deeplink = deeplink;
	// }

}

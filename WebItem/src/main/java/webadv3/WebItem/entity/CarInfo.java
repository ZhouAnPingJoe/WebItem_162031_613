package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the car_info database table.
 * 
 */
@Entity
@Table(name="car_info")
@NamedQuery(name="CarInfo.findAll", query="SELECT c FROM CarInfo c")
public class CarInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="car_info_id")
	private int carInfoId;

	@Column(name="car_number")
	private String carNumber;

	@Column(name="car_type")
	private String carType;

	@Column(name="in_time")
	private Timestamp inTime;

	@Column(name="out_time")
	private Timestamp outTime;

	//bi-directional many-to-one association to Owner
	@ManyToOne
	@JoinColumn(name="account")
	private Owner owner;

	public CarInfo() {
	}

	public int getCarInfoId() {
		return this.carInfoId;
	}

	public void setCarInfoId(int carInfoId) {
		this.carInfoId = carInfoId;
	}

	public String getCarNumber() {
		return this.carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarType() {
		return this.carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Timestamp getInTime() {
		return this.inTime;
	}

	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}

	public Timestamp getOutTime() {
		return this.outTime;
	}

	public void setOutTime(Timestamp outTime) {
		this.outTime = outTime;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
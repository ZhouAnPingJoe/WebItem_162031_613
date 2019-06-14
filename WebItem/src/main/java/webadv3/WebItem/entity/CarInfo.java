package webadv3.WebItem.entity;

import java.io.Serializable;
import java.sql.Timestamp;



public class CarInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String carId;

	
	private String carType;

	
	private Timestamp inTime;

	
	private Timestamp outTime;


	private Owner owner;

	public CarInfo() {
	}

	public String getCarId() {
		return this.carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
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
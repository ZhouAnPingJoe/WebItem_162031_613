package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.List;



public class House implements Serializable {
	private static final long serialVersionUID = 1L;


	private int houseId;

	private double area;

	private String type;


	private List<Fee> fees;


	private BulidingUnitId bulidingUnitId;


	private Owner owner;

	public House() {
	}

	public int getHouseId() {
		return this.houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Fee> getFees() {
		return this.fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	public Fee addFee(Fee fee) {
		getFees().add(fee);
		fee.setHouse(this);

		return fee;
	}

	public Fee removeFee(Fee fee) {
		getFees().remove(fee);
		fee.setHouse(null);

		return fee;
	}

	public BulidingUnitId getBulidingUnitId() {
		return this.bulidingUnitId;
	}

	public void setBulidingUnitId(BulidingUnitId bulidingUnitId) {
		this.bulidingUnitId = bulidingUnitId;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
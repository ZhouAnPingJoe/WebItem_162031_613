package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the house database table.
 * 
 */
@Entity
@NamedQuery(name="House.findAll", query="SELECT h FROM House h")
public class House implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="house_id")
	private int houseId;

	private double area;

	@Column(name="house_number")
	private String houseNumber;

	private String type;

	//bi-directional many-to-one association to Fee
	@OneToMany(mappedBy="house")
	private List<Fee> fees;

	//bi-directional many-to-one association to BulidingUnitId
	@ManyToOne
	@JoinColumn(name="building_unitid")
	private BulidingUnitId bulidingUnitId;

	//bi-directional many-to-one association to Owner
	@ManyToOne
	@JoinColumn(name="account")
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

	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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
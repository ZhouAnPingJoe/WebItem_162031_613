package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the buliding_unit_id database table.
 * 
 */
@Entity
@Table(name="buliding_unit_id")
@NamedQuery(name="BulidingUnitId.findAll", query="SELECT b FROM BulidingUnitId b")
public class BulidingUnitId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="building_unitid")
	private int buildingUnitid;

	private String name;

	//bi-directional many-to-one association to Building
	@ManyToOne
	@JoinColumn(name="building_id")
	private Building building;

	//bi-directional many-to-one association to House
	@OneToMany(mappedBy="bulidingUnitId")
	private List<House> houses;

	public BulidingUnitId() {
	}

	public int getBuildingUnitid() {
		return this.buildingUnitid;
	}

	public void setBuildingUnitid(int buildingUnitid) {
		this.buildingUnitid = buildingUnitid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public List<House> getHouses() {
		return this.houses;
	}

	public void setHouses(List<House> houses) {
		this.houses = houses;
	}

	public House addHous(House hous) {
		getHouses().add(hous);
		hous.setBulidingUnitId(this);

		return hous;
	}

	public House removeHous(House hous) {
		getHouses().remove(hous);
		hous.setBulidingUnitId(null);

		return hous;
	}

}
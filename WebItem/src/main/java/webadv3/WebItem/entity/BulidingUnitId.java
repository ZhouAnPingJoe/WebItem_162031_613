package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.List;



public class BulidingUnitId implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int buildingUnitid;

	private String name;

	
	private Building building;


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
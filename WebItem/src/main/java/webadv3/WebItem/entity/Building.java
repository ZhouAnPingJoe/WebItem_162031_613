package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;




public class Building implements Serializable {
	private static final long serialVersionUID = 1L;


	private int buildingId;

	private String name;


	private Date time;


	private List<BulidingUnitId> bulidingUnitIds;


	private List<Depot> depots;

	public Building() {
	}

	public int getBuildingId() {
		return this.buildingId;
	}

	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<BulidingUnitId> getBulidingUnitIds() {
		return this.bulidingUnitIds;
	}

	public void setBulidingUnitIds(List<BulidingUnitId> bulidingUnitIds) {
		this.bulidingUnitIds = bulidingUnitIds;
	}

	public BulidingUnitId addBulidingUnitId(BulidingUnitId bulidingUnitId) {
		getBulidingUnitIds().add(bulidingUnitId);
		bulidingUnitId.setBuilding(this);

		return bulidingUnitId;
	}

	public BulidingUnitId removeBulidingUnitId(BulidingUnitId bulidingUnitId) {
		getBulidingUnitIds().remove(bulidingUnitId);
		bulidingUnitId.setBuilding(null);

		return bulidingUnitId;
	}

	public List<Depot> getDepots() {
		return this.depots;
	}

	public void setDepots(List<Depot> depots) {
		this.depots = depots;
	}

	public Depot addDepot(Depot depot) {
		getDepots().add(depot);
		depot.setBuilding(this);

		return depot;
	}

	public Depot removeDepot(Depot depot) {
		getDepots().remove(depot);
		depot.setBuilding(null);

		return depot;
	}

}
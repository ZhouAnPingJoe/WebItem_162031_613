package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the building database table.
 * 
 */
@Entity
@NamedQuery(name="Building.findAll", query="SELECT b FROM Building b")
public class Building implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="building_id")
	private int buildingId;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date time;

	//bi-directional many-to-one association to BulidingUnitId
	@OneToMany(mappedBy="building")
	private List<BulidingUnitId> bulidingUnitIds;

	//bi-directional many-to-one association to Depot
	@OneToMany(mappedBy="building")
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
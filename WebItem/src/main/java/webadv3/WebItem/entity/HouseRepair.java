package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the house_repair database table.
 * 
 */
@Entity
@Table(name="house_repair")
@NamedQuery(name="HouseRepair.findAll", query="SELECT h FROM HouseRepair h")
public class HouseRepair implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="check_status")
	private String checkStatus;

	@Column(name="check_time")
	private Timestamp checkTime;

	private String content;

	@Column(name="repair_cost")
	private double repairCost;

	private String sender;

	private String status;

	private Timestamp time;

	//bi-directional many-to-one association to Propertyadmin
	@ManyToOne
	@JoinColumn(name="account")
	private Propertyadmin propertyadmin;

	public HouseRepair() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getRepairCost() {
		return this.repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Propertyadmin getPropertyadmin() {
		return this.propertyadmin;
	}

	public void setPropertyadmin(Propertyadmin propertyadmin) {
		this.propertyadmin = propertyadmin;
	}

}
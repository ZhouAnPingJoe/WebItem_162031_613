package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the duty_manage database table.
 * 
 */
@Entity
@Table(name="duty_manage")
@NamedQuery(name="DutyManage.findAll", query="SELECT d FROM DutyManage d")
public class DutyManage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="duty_id")
	private int dutyId;

	private String address;

	@Temporal(TemporalType.DATE)
	@Column(name="duty_time")
	private Date dutyTime;

	private String name;

	private String record;

	private String type;

	public DutyManage() {
	}

	public int getDutyId() {
		return this.dutyId;
	}

	public void setDutyId(int dutyId) {
		this.dutyId = dutyId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDutyTime() {
		return this.dutyTime;
	}

	public void setDutyTime(Date dutyTime) {
		this.dutyTime = dutyTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecord() {
		return this.record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
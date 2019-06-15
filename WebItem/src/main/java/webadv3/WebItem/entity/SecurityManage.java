package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the security_manage database table.
 * 
 */
@Entity
@Table(name="security_manage")
@NamedQuery(name="SecurityManage.findAll", query="SELECT s FROM SecurityManage s")
public class SecurityManage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="security_id")
	private int securityId;

	private String address;

	private String classes;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="end_time")
	private Timestamp endTime;

	private String job;

	private String member;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="start_time")
	private Timestamp startTime;

	public SecurityManage() {
	}

	public int getSecurityId() {
		return this.securityId;
	}

	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMember() {
		return this.member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

}
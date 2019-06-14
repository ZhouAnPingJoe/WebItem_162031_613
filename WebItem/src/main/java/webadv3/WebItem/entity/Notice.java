package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;



public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;


	private int noticeId;

	private String content;

	private Date endTime;

	private String item;

	
	private Date startTime;

	private String status;

	private Timestamp time;

	private Propertyadmin propertyadmin;

	public Notice() {
	}

	public int getNoticeId() {
		return this.noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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
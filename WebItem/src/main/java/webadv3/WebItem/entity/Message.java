package webadv3.WebItem.entity;

import java.io.Serializable;
import java.sql.Timestamp;



public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	private int messageId;

	private String content;

	private int sender;

	private String status;

	private Timestamp time;


	private Propertyadmin propertyadmin;

	public Message() {
	}

	public int getMessageId() {
		return this.messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getSender() {
		return this.sender;
	}

	public void setSender(int sender) {
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
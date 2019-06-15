package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the suggestion database table.
 * 
 */
@Entity
@NamedQuery(name="Suggestion.findAll", query="SELECT s FROM Suggestion s")
public class Suggestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="suggestion_id")
	private int suggestionId;

	private String content;

	private String sender;

	private String status;

	private Timestamp time;

	//bi-directional many-to-one association to Propertyadmin
	@ManyToOne
	@JoinColumn(name="account")
	private Propertyadmin propertyadmin;

	public Suggestion() {
	}

	public int getSuggestionId() {
		return this.suggestionId;
	}

	public void setSuggestionId(int suggestionId) {
		this.suggestionId = suggestionId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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
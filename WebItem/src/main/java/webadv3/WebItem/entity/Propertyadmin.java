package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * The persistent class for the propertyadmin database table.
 * 
 */
@Entity
@NamedQuery(name="Propertyadmin.findAll", query="SELECT p FROM Propertyadmin p")
public class Propertyadmin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String account;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date birth;

	private String email;

	private String password;

	@Column(name="property_admin_username")
	private String propertyAdminUsername;

	private String sex;

	private String telephone;

	private String type;

	//bi-directional many-to-one association to HouseRepair
	@OneToMany(mappedBy="propertyadmin")
	private List<HouseRepair> houseRepairs;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="propertyadmin")
	private List<Message> messages;

	//bi-directional many-to-one association to Notice
	@OneToMany(mappedBy="propertyadmin")
	private List<Notice> notices;

	//bi-directional many-to-one association to Rule
	@OneToMany(mappedBy="propertyadmin")
	private List<Rule> rules;

	//bi-directional many-to-one association to Suggestion
	@OneToMany(mappedBy="propertyadmin")
	private List<Suggestion> suggestions;

	public Propertyadmin() {
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPropertyAdminUsername() {
		return this.propertyAdminUsername;
	}

	public void setPropertyAdminUsername(String propertyAdminUsername) {
		this.propertyAdminUsername = propertyAdminUsername;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<HouseRepair> getHouseRepairs() {
		return this.houseRepairs;
	}

	public void setHouseRepairs(List<HouseRepair> houseRepairs) {
		this.houseRepairs = houseRepairs;
	}

	public HouseRepair addHouseRepair(HouseRepair houseRepair) {
		getHouseRepairs().add(houseRepair);
		houseRepair.setPropertyadmin(this);

		return houseRepair;
	}

	public HouseRepair removeHouseRepair(HouseRepair houseRepair) {
		getHouseRepairs().remove(houseRepair);
		houseRepair.setPropertyadmin(null);

		return houseRepair;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setPropertyadmin(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setPropertyadmin(null);

		return message;
	}

	public List<Notice> getNotices() {
		return this.notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	public Notice addNotice(Notice notice) {
		getNotices().add(notice);
		notice.setPropertyadmin(this);

		return notice;
	}

	public Notice removeNotice(Notice notice) {
		getNotices().remove(notice);
		notice.setPropertyadmin(null);

		return notice;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public Rule addRule(Rule rule) {
		getRules().add(rule);
		rule.setPropertyadmin(this);

		return rule;
	}

	public Rule removeRule(Rule rule) {
		getRules().remove(rule);
		rule.setPropertyadmin(null);

		return rule;
	}

	public List<Suggestion> getSuggestions() {
		return this.suggestions;
	}

	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	}

	public Suggestion addSuggestion(Suggestion suggestion) {
		getSuggestions().add(suggestion);
		suggestion.setPropertyadmin(this);

		return suggestion;
	}

	public Suggestion removeSuggestion(Suggestion suggestion) {
		getSuggestions().remove(suggestion);
		suggestion.setPropertyadmin(null);

		return suggestion;
	}

}
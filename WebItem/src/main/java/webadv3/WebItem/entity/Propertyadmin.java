package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class Propertyadmin implements Serializable {
	private static final long serialVersionUID = 1L;


	private int account;


	private Date birth;

	private String email;

	private String password;

	private String sex;

	private int telephone;

	private String type;


	private List<HouseRepair> houseRepairs;


	private List<Message> messages;


	private List<Notice> notices;


	private List<Rule> rules;


	private List<Suggestion> suggestions;

	public Propertyadmin() {
	}

	public int getAccount() {
		return this.account;
	}

	public void setAccount(int account) {
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

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getTelephone() {
		return this.telephone;
	}

	public void setTelephone(int telephone) {
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
package webadv3.WebItem.entity;

import java.io.Serializable;




public class User implements Serializable {
	private static final long serialVersionUID = 1L;


	private int id;

	private int account;

	private String password;

	private String type;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount() {
		return this.account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
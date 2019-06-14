package webadv3.WebItem.entity;

import java.io.Serializable;

public class FamilyMember implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int memberId;

	private String name;

	private String relationship;

	private String sex;

	private int telephone;

	private String workunit;

	
	private Owner owner;

	public FamilyMember() {
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
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

	public String getWorkunit() {
		return this.workunit;
	}

	public void setWorkunit(String wordunit) {
		this.workunit = wordunit;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
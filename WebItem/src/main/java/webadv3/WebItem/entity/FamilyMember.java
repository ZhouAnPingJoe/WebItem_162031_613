package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the family_member database table.
 * 
 */
@Entity
@Table(name="family_member")
@NamedQuery(name="FamilyMember.findAll", query="SELECT f FROM FamilyMember f")
public class FamilyMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="member_id")
	private int memberId;

	private String name;

	private String relationship;

	private String sex;

	private String telephone;

	private String wordunit;

	//bi-directional many-to-one association to Owner
	@ManyToOne
	@JoinColumn(name="account")
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

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getWordunit() {
		return this.wordunit;
	}

	public void setWordunit(String wordunit) {
		this.wordunit = wordunit;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
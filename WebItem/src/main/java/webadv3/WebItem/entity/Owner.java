package webadv3.WebItem.entity;

import java.io.Serializable;
import java.util.List;



public class Owner implements Serializable {
	private static final long serialVersionUID = 1L;

	private int account;

	private int idcard;

	private String name;

	private String password;

	private String sex;

	private String status;

	private int telephone;

	private String type;

	private List<CarInfo> carInfos;

	private List<Depot> depots;

	
	private List<FamilyMember> familyMembers;


	private List<House> houses;

	public Owner() {
	}

	public int getAccount() {
		return this.account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getIdcard() {
		return this.idcard;
	}

	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public List<CarInfo> getCarInfos() {
		return this.carInfos;
	}

	public void setCarInfos(List<CarInfo> carInfos) {
		this.carInfos = carInfos;
	}

	public CarInfo addCarInfo(CarInfo carInfo) {
		getCarInfos().add(carInfo);
		carInfo.setOwner(this);

		return carInfo;
	}

	public CarInfo removeCarInfo(CarInfo carInfo) {
		getCarInfos().remove(carInfo);
		carInfo.setOwner(null);

		return carInfo;
	}

	public List<Depot> getDepots() {
		return this.depots;
	}

	public void setDepots(List<Depot> depots) {
		this.depots = depots;
	}

	public Depot addDepot(Depot depot) {
		getDepots().add(depot);
		depot.setOwner(this);

		return depot;
	}

	public Depot removeDepot(Depot depot) {
		getDepots().remove(depot);
		depot.setOwner(null);

		return depot;
	}

	public List<FamilyMember> getFamilyMembers() {
		return this.familyMembers;
	}

	public void setFamilyMembers(List<FamilyMember> familyMembers) {
		this.familyMembers = familyMembers;
	}

	public FamilyMember addFamilyMember(FamilyMember familyMember) {
		getFamilyMembers().add(familyMember);
		familyMember.setOwner(this);

		return familyMember;
	}

	public FamilyMember removeFamilyMember(FamilyMember familyMember) {
		getFamilyMembers().remove(familyMember);
		familyMember.setOwner(null);

		return familyMember;
	}

	public List<House> getHouses() {
		return this.houses;
	}

	public void setHouses(List<House> houses) {
		this.houses = houses;
	}

	public House addHous(House hous) {
		getHouses().add(hous);
		hous.setOwner(this);

		return hous;
	}

	public House removeHous(House hous) {
		getHouses().remove(hous);
		hous.setOwner(null);

		return hous;
	}

}
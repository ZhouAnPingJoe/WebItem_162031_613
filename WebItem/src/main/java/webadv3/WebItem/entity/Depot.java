package webadv3.WebItem.entity;

import java.io.Serializable;
import java.sql.Timestamp;



public class Depot implements Serializable {
	private static final long serialVersionUID = 1L;


	private int depotId;

	private double area;


	private String deportStatus;

	
	private String depotType;

	private String location;

	
	private String manageType;


	private int parkId;

	private double price;


	private String saleStatus;


	private Timestamp saleTime;

	private Building building;


	private Owner owner;

	public Depot() {
	}

	public int getDepotId() {
		return this.depotId;
	}

	public void setDepotId(int depotId) {
		this.depotId = depotId;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getDeportStatus() {
		return this.deportStatus;
	}

	public void setDeportStatus(String deportStatus) {
		this.deportStatus = deportStatus;
	}

	public String getDepotType() {
		return this.depotType;
	}

	public void setDepotType(String depotType) {
		this.depotType = depotType;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManageType() {
		return this.manageType;
	}

	public void setManageType(String manageType) {
		this.manageType = manageType;
	}

	public int getParkId() {
		return this.parkId;
	}

	public void setParkId(int parkId) {
		this.parkId = parkId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}

	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Timestamp getSaleTime() {
		return this.saleTime;
	}

	public void setSaleTime(Timestamp saleTime) {
		this.saleTime = saleTime;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
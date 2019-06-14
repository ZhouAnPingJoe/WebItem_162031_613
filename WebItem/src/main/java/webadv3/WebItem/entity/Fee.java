package webadv3.WebItem.entity;

import java.io.Serializable;
import java.sql.Timestamp;



public class Fee implements Serializable {
	private static final long serialVersionUID = 1L;


	private int feeId;

	private double arrearage;


	private Timestamp endTime;

	private String name;


	private Timestamp paymentTime;

	private double price;

	private double quantity;

	private int recorder;


	private Timestamp startTime;


	private House house;

	public Fee() {
	}

	public int getFeeId() {
		return this.feeId;
	}

	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}

	public double getArrearage() {
		return this.arrearage;
	}

	public void setArrearage(double arrearage) {
		this.arrearage = arrearage;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getPaymentTime() {
		return this.paymentTime;
	}

	public void setPaymentTime(Timestamp paymentTime) {
		this.paymentTime = paymentTime;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getRecorder() {
		return this.recorder;
	}

	public void setRecorder(int recorder) {
		this.recorder = recorder;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public House getHouse() {
		return this.house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

}
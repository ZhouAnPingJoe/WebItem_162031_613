package webadv3.WebItem.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fee database table.
 * 
 */
@Entity
@NamedQuery(name="Fee.findAll", query="SELECT f FROM Fee f")
public class Fee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fee_id")
	private int feeId;

	private double arrearage;

	@Column(name="end_time")
	private Timestamp endTime;

	private String name;

	@Column(name="payment_time")
	private Timestamp paymentTime;

	private double price;

	private double quantity;

	private String recorder;

	@Column(name="start_time")
	private Timestamp startTime;

	//bi-directional many-to-one association to House
	@ManyToOne
	@JoinColumn(name="house_id")
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

	public String getRecorder() {
		return this.recorder;
	}

	public void setRecorder(String recorder) {
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
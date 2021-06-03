package com.capgemini.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component /* it will detect our custom beans */
@Scope(scopeName = "prototype") /* keeping this as prototype */
@Entity /* Creating table */
@Table(name = "VendorAddress") /* specifying name of table */
public class VendorAddress {
	@Id /* defining primary key */
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* generating value automatically */
	@Column(name = "Vendor_Address_Id") /* specifying column name */
	private int vendorAddressId;

	/*
	 * specifying column name, giving length and giving constraint as not null
	 */
	@Column(name = "vendor_City", length = 20, nullable = false)
	private String vendorCity;

	/*
	 * specifying column name, giving length and giving constraint as not null
	 */
	@Column(name = "AREA", length = 25, nullable = false)
	private String area;

	/*
	 * specifying column name, giving length and giving constraint as not null
	 */
	@Column(name = "Vendor_State", length = 20, nullable = false)
	private String vendorState;

	/*
	 * specifying column name, giving length and giving constraint as not null
	 */
	@Column(name = "Vendor_Pincode", length = 6, nullable = false)
	private long vendorPincode;

	/* creating parameterized constructor */
	public VendorAddress(String area, String vendorCity, String vendorState, long vendorPincode) {
		super();
		this.area = area;
		this.vendorCity = vendorCity;
		this.vendorState = vendorState;
		this.vendorPincode = vendorPincode;
	}

	/* creating default constructor */
	public VendorAddress() {

	}

	/* creating getters and setters */
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getVendorAddressId() {
		return vendorAddressId;
	}

	public void setVendorAddressId(int vendorAddressId) {
		this.vendorAddressId = vendorAddressId;
	}

	public String getVendorCity() {
		return vendorCity;
	}

	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}

	public String getVendorState() {
		return vendorState;
	}

	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}

	public long getVendorPincode() {
		return vendorPincode;
	}

	public void setVendorPincode(long vendorPincode) {
		this.vendorPincode = vendorPincode;
	}

	/* creating toString method */
	@Override
	public String toString() {
		return "VendorAddress [vendorAddressId=" + vendorAddressId + ", vendorCity=" + vendorCity + ", area=" + area
				+ ", vendorState=" + vendorState + ", vendorPincode=" + vendorPincode + "]";
	}

}
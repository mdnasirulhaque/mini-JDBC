package com.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;

public class Toy_Store {
	SimpleDateFormat df = new SimpleDateFormat("HH:mm");
	static int generator=0;
	private int toyStoreId;
	private String toyStoreName;
	private String city;
	private String phoneNo;
	private Timestamp storeOpeningTime;
	private Timestamp storeClosingTime;
	
	java.sql.Timestamp sqlTime=new java.sql.Timestamp((new java.util.Date().getTime()));
	
	public Toy_Store(String toyStoreName, String city,
			String phoneNo, String storeOpeningTime, String storeClosingTime) throws ParseException {
		super();
		this.toyStoreId = ++generator;
		this.toyStoreName = toyStoreName;
		this.city=city;
		this.phoneNo = phoneNo;
		this.storeOpeningTime= new Timestamp(((df.parse(storeOpeningTime).getTime()-df.parse("08:00").getTime())>0)?df.parse(storeOpeningTime).getTime():df.parse("08:00").getTime());
		this.storeClosingTime = new Timestamp(((df.parse(storeClosingTime).getTime()-df.parse("22:00").getTime())<0)?df.parse(storeOpeningTime).getTime():df.parse("22:00").getTime());
		//System.out.println(this.storeOpeningTime);
	}
	
	public Toy_Store(String toyStoreName,
			String phoneNo, String storeOpeningTime, String storeClosingTime) throws ParseException {
		super();
		this.toyStoreId = ++generator;
		this.toyStoreName = toyStoreName;
		this.city="Delhi";
		this.phoneNo = phoneNo;
		this.storeOpeningTime=sqlTime; // = new Timestamp(((df.parse(storeOpeningTime).getTime()-df.parse("08:00").getTime())>0)?df.parse(storeOpeningTime).getTime():df.parse("08:00").getTime());
		this.storeClosingTime = new Timestamp(((df.parse(storeClosingTime).getTime()-df.parse("22:00").getTime())<0)?df.parse(storeOpeningTime).getTime():df.parse("22:00").getTime());
		System.out.println(new java.util.Date().getTime());
	}
	/**
	 * @return the toyStoreId
	 */
	public int getToyStoreId() {
		return toyStoreId;
	}

	/**
	 * @param toyStoreId the toyStoreId to set
	 */
	public void setToyStoreId(int toyStoreId) {
		this.toyStoreId = toyStoreId;
	}

	/**
	 * @return the toyStoreName
	 */
	public String getToyStoreName() {
		return toyStoreName;
	}

	/**
	 * @param toyStoreName the toyStoreName to set
	 */
	public void setToyStoreName(String toyStoreName) {
		this.toyStoreName = toyStoreName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the storeOpeningTime
	 */
	public Timestamp getStoreOpeningTime() {
		return storeOpeningTime;
	}

	/**
	 * @param storeOpeningTime the storeOpeningTime to set
	 */
	public void setStoreOpeningTime(Timestamp storeOpeningTime) {
		this.storeOpeningTime = storeOpeningTime;
	}

	/**
	 * @return the storeClosingTime
	 */
	public Timestamp getStoreClosingTime() {
		return storeClosingTime;
	}

	/**
	 * @param storeClosingTime the storeClosingTime to set
	 */
	public void setStoreClosingTime(Timestamp storeClosingTime) {
		this.storeClosingTime = storeClosingTime;
	}
}

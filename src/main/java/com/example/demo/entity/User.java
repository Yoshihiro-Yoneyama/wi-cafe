package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//ユーザクラス

@Entity
@Table(name="map_marker")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int store_id;

	@Column
	private String store_name;
	
	@Column
	private String address;
	
	@Column
	private String store_url;
	
	@Column
	private int longitude;
	
	@Column
	private int latitude;
	
	@Column
	private String report;
	
	@Column
	private boolean report_flg;
	
	public int getStore_id() {
		return store_id;
	}
	
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStore_url() {
		return store_url;
	}

	public void setStore_url(String store_url) {
		this.store_url = store_url;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public boolean isReport_flg() {
		return report_flg;
	}

	public void setReport_flg(boolean report_flg) {
		this.report_flg = report_flg;
	}

}
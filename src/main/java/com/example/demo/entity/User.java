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
	
}
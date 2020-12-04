package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="map_marker")
public class MapEntity {
	
	@Id
	@Column
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer store_id;
	
	@Column
	private String store_name;
	
	@Column
	private String address;
	
	@Column
	private String store_url;
	
	@Column
	private Integer longitude;	//経度
	
	@Column
	private Integer latitude;	//緯度
	
	@Column
	private 

}

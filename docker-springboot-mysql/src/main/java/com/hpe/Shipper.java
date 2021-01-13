package com.hpe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "shippers")
public class Shipper {
	@Id
	@Column(name = "shipper_id")
	private Integer id;
	@Column(name = "company_name")
	private String name;
	private String phone;
}

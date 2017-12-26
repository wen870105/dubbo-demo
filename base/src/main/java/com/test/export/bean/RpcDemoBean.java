package com.test.export.bean;

import java.io.Serializable;
import java.util.Date;

public class RpcDemoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2202187730782511713L;
	private String name;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

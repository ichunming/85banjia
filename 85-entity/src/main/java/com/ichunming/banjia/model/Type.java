package com.ichunming.banjia.model;

public class Type {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column type.id
	 * @mbggenerated  Thu Mar 09 16:42:34 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column type.name
	 * @mbggenerated  Thu Mar 09 16:42:34 CST 2017
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column type.id
	 * @return  the value of type.id
	 * @mbggenerated  Thu Mar 09 16:42:34 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column type.id
	 * @param id  the value for type.id
	 * @mbggenerated  Thu Mar 09 16:42:34 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column type.name
	 * @return  the value of type.name
	 * @mbggenerated  Thu Mar 09 16:42:34 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column type.name
	 * @param name  the value for type.name
	 * @mbggenerated  Thu Mar 09 16:42:34 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}
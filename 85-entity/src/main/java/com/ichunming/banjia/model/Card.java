package com.ichunming.banjia.model;

import java.util.Date;

public class Card {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column card.id
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column card.uid
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	private Long uid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column card.level
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	private Integer level;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column card.effect_date
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	private Date effectDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column card.expire_date
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	private Date expireDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column card.id
	 * @return  the value of card.id
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column card.id
	 * @param id  the value for card.id
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column card.uid
	 * @return  the value of card.uid
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public Long getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column card.uid
	 * @param uid  the value for card.uid
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public void setUid(Long uid) {
		this.uid = uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column card.level
	 * @return  the value of card.level
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column card.level
	 * @param level  the value for card.level
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column card.effect_date
	 * @return  the value of card.effect_date
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public Date getEffectDate() {
		return effectDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column card.effect_date
	 * @param effectDate  the value for card.effect_date
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column card.expire_date
	 * @return  the value of card.expire_date
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column card.expire_date
	 * @param expireDate  the value for card.expire_date
	 * @mbggenerated  Thu Mar 09 17:45:44 CST 2017
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
}
/**
 * @author ming
 * @date 2017年3月8日 下午2:33:11
 */
package com.ichunming.banjia.entity;

import com.ichunming.common.helper.SessionInfo;

public class BanjiaSessionInfo extends SessionInfo {
	private Integer agent;

	public BanjiaSessionInfo() {}
	
	public BanjiaSessionInfo(String uid, String username, Integer agent) {
		super(uid, username);
		this.agent = agent;
	}
	
	public Integer getAgent() {
		return agent;
	}

	public void setAgent(Integer agent) {
		this.agent = agent;
	}
}

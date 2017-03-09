/**
 * @author ming
 * @date 2017年3月9日 下午5:02:13
 */
package com.ichunming.banjia.service;

import java.util.List;

import com.ichunming.banjia.vo.CardInfo;
import com.ichunming.banjia.vo.PromoteInfo;

public interface ICardService {
	public List<CardInfo> getCards();
	
	public List<PromoteInfo> getPromotes();
}

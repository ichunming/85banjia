package com.ichunming.banjia.dao;

import java.util.List;

import com.ichunming.banjia.model.Card;
import com.ichunming.banjia.vo.CardInfo;

public interface CardDao extends GenericDao<Card, Long>{
	public List<CardInfo> getCards();
}
/**
 * @author ming
 * @date 2017年3月9日 下午5:02:37
 */
package com.ichunming.banjia.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ichunming.banjia.dao.CardDao;
import com.ichunming.banjia.dao.PromoteDao;
import com.ichunming.banjia.service.ICardService;
import com.ichunming.banjia.vo.CardInfo;
import com.ichunming.banjia.vo.PromoteInfo;

@Service
public class CardServiceImpl implements ICardService {
	private static final Logger logger = LoggerFactory.getLogger(CardServiceImpl.class);
	
	@Autowired
	private CardDao cardDao;
	
	@Autowired
	private PromoteDao promoteDao;

	/* (non-Javadoc)
	 * @see com.ichunming.banjia.service.ICardService#getCards()
	 */
	@Override
	public List<CardInfo> getCards() {
		return cardDao.getCards();
	}

	/* (non-Javadoc)
	 * @see com.ichunming.banjia.service.ICardService#getPromotes()
	 */
	@Override
	public List<PromoteInfo> getPromotes() {
		return promoteDao.getPromotes();
	}
}

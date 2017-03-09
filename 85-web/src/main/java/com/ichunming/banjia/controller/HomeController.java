/**
 * @author ming
 * @date 2017年3月9日 下午5:06:28
 */
package com.ichunming.banjia.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ichunming.banjia.service.ICardService;
import com.ichunming.banjia.vo.CardInfo;
import com.ichunming.banjia.vo.PromoteInfo;

@Controller
@RequestMapping("/home")
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ICardService cardService;
	
	@RequestMapping(value="card/list", method=RequestMethod.GET)
	public String list() {
		logger.debug("home-card-list request...");
		
		List<CardInfo> cards = cardService.getCards();
		
		return "index";
	}
}

package com.mynotes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	private Logger logger = LogManager.getLogger(this.getClass());
	@RequestMapping(value="/")
	public String home(){
		String msg ="Congratulations! Docker app deployed successfully!";
		logger.info(msg);
		return msg;
	}

}

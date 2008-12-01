package org.springhispano.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwitterTimelineController {

	@RequestMapping("/twitter.html")
	public String twitterTimeline(){
		return "twitterView";
	}
	
	@RequestMapping("/myTwitter.html")
	public String myTwitterTimeline(){
		return "myTwitterView";
	}
}

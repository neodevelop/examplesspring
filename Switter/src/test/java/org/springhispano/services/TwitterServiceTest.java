package org.springhispano.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import twitter4j.TwitterException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:TwitterAppCtx.xml"})
public class TwitterServiceTest {

	@Autowired
	TwitterService twitterService;
	
	@Test
	public void twitterServiceTest1(){
		try {
			twitterService.obtenerLineaDeTiempo("twitterUser", "password");
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void twitterServiceTest2(){
		try {
			twitterService.obtenerLineaDeTiempoPublica();
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}
}

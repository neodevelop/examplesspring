package org.springhispano.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springhispano.services.TwitterService;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

@Service("twitterService")
public class TwitterServiceImpl implements TwitterService {

	public void actualizaEstado(String twitterUser, String twitterPassword,
			String message) throws TwitterException {
		Twitter twitter = new Twitter(twitterUser, twitterPassword);
		Status status = twitter.update(message);
		System.out.println("Successfully updated the status to ["
				+ status.getText() + "].");
	}

	public List<Status> obtenerLineaDeTiempo(String twitterUser,
			String twitterPassword) throws TwitterException {
		Twitter twitter = new Twitter(twitterUser, twitterPassword);
		List<Status> statuses = twitter.getFriendsTimeline();
		System.out.println("Showing friends timeline.");
		for (Status status : statuses) {
			System.out.println(status.getUser().getName() + ":"
					+ status.getText());
		}
		return statuses;

	}

	public List<Status> obtenerLineaDeTiempoPublica() throws TwitterException {
		Twitter unauthenticatedTwitter = new Twitter();
		List<Status> statuses = unauthenticatedTwitter.getPublicTimeline();
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                               status.getText());
        }
		return statuses;
	}

}

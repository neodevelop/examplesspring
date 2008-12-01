package org.springhispano.services;

import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;

public interface TwitterService {
	void actualizaEstado(String twitterUser,String twitterPassword,String message) throws TwitterException;
	List<Status> obtenerLineaDeTiempo(String twitterUser,String twitterPassword) throws TwitterException;
	List<Status> obtenerLineaDeTiempoPublica() throws TwitterException;
}

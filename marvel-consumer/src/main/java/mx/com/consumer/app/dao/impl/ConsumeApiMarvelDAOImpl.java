package mx.com.consumer.app.dao.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import mx.com.consumer.app.dao.IConsumeMarvelDAO;

@Repository
public class ConsumeApiMarvelDAOImpl implements IConsumeMarvelDAO {

	@Value("${marvel.config.hash}")
	private String HASH;
	
	@Value("${marvel.config.apikey}")
	private String API;

	@Override
	public StringBuilder getCharactersInfo() {
		StringBuilder sb = new StringBuilder();
		HttpURLConnection conn = null;
		try {
			URL url = new URL(
					"https://gateway.marvel.com/v1/public/characters?apikey=" + API + "&ts=1&hash=" + HASH);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP Error code : " + conn.getResponseCode());
			}
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(in);
			String output;
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}

		} catch (Exception e) {
			System.out.println("Exception in NetClientGet:- " + e);
		} finally {
			if (!Objects.isNull(conn)) {
				conn.disconnect();
			}
		}
		return sb;
	}

}

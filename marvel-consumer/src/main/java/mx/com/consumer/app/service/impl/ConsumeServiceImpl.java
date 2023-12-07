/**
 * Interface para consumo de API Marvel
 */
package mx.com.consumer.app.service.impl;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import mx.com.consumer.app.dao.IConsumeMarvelDAO;
import mx.com.consumer.app.service.IConsumeService;
import mx.com.marvel.common.model.Root;

/**
 * 
 */
@Service
public class ConsumeServiceImpl implements IConsumeService {

	Logger LOG = LoggerFactory.getLogger(ConsumeServiceImpl.class);	
	
	@Autowired
	private IConsumeMarvelDAO dao;
	
	
	@Override
	public Root getRootCharacteres() {
		StringBuilder sb = dao.getCharactersInfo();
		if(Objects.isNull(sb) || sb.toString().trim().isEmpty()) {
			LOG.error("Manage Error");
			return null;
		}
		Root root = null;
		Gson gson = new Gson();
		root = gson.fromJson(sb.toString(), new TypeToken<Root>(){}.getType());
		return root;
	}

}

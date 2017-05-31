package com.tournament.chess.service.impl;

import com.tournament.chess.dto.*;
import com.tournament.chess.entity.*;
import com.tournament.chess.repository.*;
import com.tournament.chess.service.*;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;

import java.lang.reflect.*;
import java.util.*;

/**
 * Created by admin on 3/22/17.
 */
public class BaseCrudService<T extends BaseEntity, K extends BaseDto> implements BaseService<T,K> {

	@Autowired
	protected BaseRepository<T> repository;

	@Autowired
	protected ModelMapper modelMapper;

	protected Class<T> entityClass;
	protected Class<K> modelClass;

	@SuppressWarnings("unchecked")
	public BaseCrudService() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
		this.modelClass = (Class<K>) genericSuperclass.getActualTypeArguments()[1];
	}

	public K findOne(int id) {
		T entity = repository.findOne(id);
		return modelMapper.map(entity, modelClass);
	}

	public List<K> findAll() {
		List<K> result = new ArrayList<>();
		List<T> entities = repository.findAll();
		for (T entity : entities)
		{
			result.add(modelMapper.map(entity, modelClass));
		}
		return result;
	}

	public void update(K model) {
		T entity = modelMapper.map(model, entityClass);
		beforeUpdate(entity);
		repository.save(entity);
	}

	public void delete(int id) {
		T entity = repository.findOne(id);
		repository.save(entity);
	}

	public int create(K model) {
		T entity = modelMapper.map(model, entityClass);
		beforeAdd(entity);
		entity = repository.save(entity);
		return entity.getId();
	}

	protected void beforeUpdate(T entity) {
		entity.setDateEdited(new Date().getTime());
	}

	protected void beforeAdd(T entity) {
		entity.setDateAdded(new Date().getTime());
	}
}

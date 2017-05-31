package com.tournament.chess.service;

import java.util.*;

/**
 * Created by admin on 3/22/17.
 */
public interface BaseService<T, K> extends SequenceConstants{

	K findOne(int id);

	List<K> findAll();

	void update(K model);

	void delete(int id);

	int create(K model);
}

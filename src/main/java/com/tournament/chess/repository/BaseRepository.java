package com.tournament.chess.repository;

import com.tournament.chess.entity.*;
import org.springframework.data.mongodb.repository.*;
import org.springframework.data.repository.*;

/**
 * Created by admin on 3/22/17.
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends MongoRepository<T, Integer> {
}

package com.tournament.chess.repository;

import com.tournament.chess.entity.*;
import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Created by admin on 2/22/17.
 */
@Repository
public interface UserRepository extends BaseRepository<User> {

	User findByFirstName(String firstName);

	List<User> findByLastName(String lastName);
}

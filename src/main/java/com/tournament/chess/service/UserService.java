package com.tournament.chess.service;

import com.tournament.chess.dto.*;
import com.tournament.chess.entity.*;
import com.tournament.chess.vo.*;

import java.util.*;

/**
 * Created by admin on 3/10/17.
 */
public interface UserService {

	UserDto add(UserDto dto);

	UserDto get(int id);

	List<UserDto> getBy(Team team);

	List<UserDto> getAll();

	List<Player> getAllPlayers();

	void delete(int id);
}

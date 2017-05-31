package com.tournament.chess.service.impl;

import com.tournament.chess.dto.*;
import com.tournament.chess.entity.*;
import com.tournament.chess.repository.*;
import com.tournament.chess.service.*;
import com.tournament.chess.vo.*;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Created by admin on 3/10/17.
 */
@Service
public class UserServiceImpl extends BaseCrudService<User, UserDto> implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto add(UserDto dto) {
		int ID = create(dto);
		return findOne(ID);
	}

	@Override
	public UserDto get(int id) {
		return findOne(id);
	}

	@Override
	public List<UserDto> getBy(Team team) {
		return null;
	}

	@Override
	public List<UserDto> getAll() {
		return findAll();
	}

	@Override
	public List<Player> getAllPlayers() {
		List<User> users = userRepository.findAll();
		List<Player> players = new ArrayList<>();
		for (User user : users) {
			players.add(modelMapper.map(user, Player.class));
		}
		return players;
	}

	@Override
	public void delete(int id) {
		delete(id);
	}
}

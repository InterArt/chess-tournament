package com.tournament.chess.controller;

import com.tournament.chess.dto.*;
import com.tournament.chess.entity.*;
import com.tournament.chess.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by admin on 3/10/17.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	UserDto add(UserDto dto) {
		return userService.add(dto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	UserDto get(@PathVariable("id") int id) {
		return userService.get(id);
	}

	@RequestMapping(value = "/team/{team}", method = RequestMethod.GET)
	List<UserDto> getBy(@PathVariable("team") String team) {
		return userService.getBy(Team.valueOf(team));
	}

	@RequestMapping(method = RequestMethod.GET)
	List<UserDto> getAll() {
		return userService.getAll();
	}

	@RequestMapping(method = RequestMethod.DELETE)
	void delete(int id) {
		userService.delete(id);
	}
}

package com.tournament.chess.controller;

import com.tournament.chess.service.*;
import com.tournament.chess.vo.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by admin on 3/22/17.
 */
@RestController
@RequestMapping(value = "/player")
public class PlayerController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	List<Player> getAll() {
		return userService.getAllPlayers();
	}
}

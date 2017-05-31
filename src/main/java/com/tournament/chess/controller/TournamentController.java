package com.tournament.chess.controller;

import com.tournament.chess.dto.*;
import com.tournament.chess.service.*;
import com.tournament.chess.vo.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by admin on 5/10/17.
 */
@RestController
@RequestMapping(value = "/tournament")
public class TournamentController {

	private TournamentService tournamentService;

	@RequestMapping(method = RequestMethod.POST)
	TournamentVO add(TournamentDto dto) {
		return tournamentService.add(dto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	TournamentVO get(@PathVariable("id") int id) {
		return tournamentService.get(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	List<TournamentVO> getAll() {
		return tournamentService.getAll();
	}

	@RequestMapping(method = RequestMethod.DELETE)
	void delete(int id) {
		tournamentService.delete(id);
	}
}

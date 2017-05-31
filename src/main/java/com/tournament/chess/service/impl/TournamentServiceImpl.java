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
 * Created by admin on 5/10/17.
 */
@Service
public class TournamentServiceImpl extends BaseCrudService<Tournament, TournamentDto> implements TournamentService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	TournamentRepository tournamentRepository;

	@Override
	public TournamentVO add(TournamentDto dto) {
		int ID = create(dto);
		Tournament tournament = tournamentRepository.findOne(ID);
		return  modelMapper.map(tournament, TournamentVO.class);
	}

	@Override
	public TournamentVO get(int ID) {
		Tournament tournament = tournamentRepository.findOne(ID);
		return  modelMapper.map(tournament, TournamentVO.class);
	}

	@Override
	public List<TournamentVO> getAll() {
		List<TournamentVO> result = new ArrayList<>();
		List<Tournament> tournaments = tournamentRepository.findAll();
		for (Tournament tournament : tournaments) {
			result.add(modelMapper.map(tournament, TournamentVO.class));
		}
		return result;
	}
}

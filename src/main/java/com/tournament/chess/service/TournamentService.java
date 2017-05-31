package com.tournament.chess.service;

import com.tournament.chess.dto.*;
import com.tournament.chess.vo.*;

import java.util.*;

/**
 * Created by admin on 5/10/17.
 */
public interface TournamentService {

	TournamentVO add(TournamentDto dto);

	TournamentVO get(int id);

	List<TournamentVO> getAll();

	void delete(int id);
}

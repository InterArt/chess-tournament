package com.tournament.chess;

import com.tournament.chess.datagen.*;
import com.tournament.chess.entity.*;
import com.tournament.chess.repository.*;
import com.tournament.chess.repository.seq.*;
import com.tournament.chess.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.*;
import org.springframework.context.event.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Created by admin on 3/10/17.
 */
@Component
public class ApplicationStartUp implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TournamentRepository tournamentRepository;
	@Autowired
	private SequenceRepository sequenceRepository;

	private static final boolean clean = false;
	private static final boolean init_test_data = false;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		if (clean) {
			tournamentRepository.deleteAll();
			userRepository.deleteAll();
		}

		if (init_test_data) {
			generateTestData();
		}
	}

	private void generateTestData() {
		List<User> users = TestDataGenerator.initUsers();
		users = userRepository.save(users);
		assert users != null;

		Tournament tournament = TestDataGenerator.initTournament(users);
		tournament.setId(sequenceRepository.getNextSequenceId(SequenceConstants.TOURNAMENT_SEQ_KEY));
		tournament = tournamentRepository.save(tournament);
		assert tournament != null;
	}
}

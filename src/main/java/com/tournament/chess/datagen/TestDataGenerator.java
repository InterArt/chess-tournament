package com.tournament.chess.datagen;

import com.tournament.chess.entity.*;

import java.util.*;

/**
 * Created by admin on 3/23/17.
 */
public class TestDataGenerator {

	public static List<User> initUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Arthur", "Hovhannisyan", Team.SOLARIS));
		users.add(new User(2, "Narek", "Petrosyan", Team.P4M));
		users.add(new User(3, "Arsen", "Babayan", Team.UNDEFINED));
		users.add(new User(4, "Hayk", "Asatryan", Team.P4M));
		users.add(new User(5, "Sasoun", "Derderian", Team.P4M));
		users.add(new User(6, "Samver", "Antanyan", Team.P4M));
		users.add(new User(7, "Seryozha", "Poghosyan", Team.MOBILITY));
		users.add(new User(8, "Artur", "Babayan", Team.MOBILITY));
		users.add(new User(9, "Avetik", "Babayan", Team.MOBILITY));
		users.add(new User(10, "Vladlen", "Poghosyan", Team.SUPPORT));

		return users;
	}

	public static Tournament initTournament(List<User> users) {
		Tournament tournament = new Tournament();
		tournament.setName("First Tournament");
		tournament.setStartDate(new Date());
		tournament.setEndDate(new Date());

		Random random = new Random();
		List<Match> matches = new ArrayList<>();
		for (int i = 0; i < users.size(); i++) {
			for (int j = i + 1; j < users.size(); j++) {
				boolean flag = random.nextBoolean();
				if (flag) {
					matches.add(initMatch(users.get(i), users.get(j), tournament));
				} else {
					matches.add(initMatch(users.get(j), users.get(i), tournament));
				}
			}
		}
		tournament.setMatches(matches);
		return tournament;
	}

	public static Match initMatch(User user1, User user2, Tournament tournament) {
		return new Match(user1, user2, tournament);
	}
}

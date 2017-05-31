package com.tournament.chess.vo;

import com.tournament.chess.entity.*;

/**
 * Created by admin on 3/22/17.
 */
public class Player extends BaseVO {

	private int id;

	private String playerName;

	private String team;

	public Player() {
	}

	public Player(int id, String playerName, Team team) {
		this.id = id;
		this.playerName = playerName;
		this.team = team.name();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}

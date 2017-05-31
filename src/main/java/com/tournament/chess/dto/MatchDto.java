package com.tournament.chess.dto;

import java.time.*;

/**
 * Created by admin on 5/10/17.
 */
public class MatchDto extends BaseDto {

	private int id;
	private UserDto first;
	private UserDto second;
	private LocalTime matchDate;
	private String room;
	private String status;
	private String result;
	private TournamentDto tournament;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserDto getFirst() {
		return first;
	}

	public void setFirst(UserDto first) {
		this.first = first;
	}

	public UserDto getSecond() {
		return second;
	}

	public void setSecond(UserDto second) {
		this.second = second;
	}

	public LocalTime getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(LocalTime matchDate) {
		this.matchDate = matchDate;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public TournamentDto getTournament() {
		return tournament;
	}

	public void setTournament(TournamentDto tournament) {
		this.tournament = tournament;
	}
}

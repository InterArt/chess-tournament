package com.tournament.chess.entity;

import javax.validation.constraints.*;
import java.util.*;

/**
 * Created by admin on 3/23/17.
 */
public class Match extends BaseEntity {

	@NotNull
	private User first;

	@NotNull
	private User second;

	@NotNull
	private Date matchDate;

	@NotNull
	private Room matchRoom;

	private MatchInfo matchInfo;

	@NotNull
	private MatchStatus status;

	@NotNull
	private Result result;

	@NotNull
	private Tournament tournament;

	public Match() {
	}

	public Match(User first, User second, Tournament tournament) {
		this(first, second, tournament, new Date());
	}

	public Match(User first, User second, Tournament tournament, Date matchDate) {
		this(first, second, tournament, matchDate, Room.UNDEFINED, null, MatchStatus.NEW, Result.NONE);
	}

	public Match(User first, User second, Tournament tournament, Date matchDate, Room matchRoom, MatchInfo matchInfo, MatchStatus status, Result result) {
		this.first = first;
		this.second = second;
		this.matchDate = matchDate;
		this.matchRoom = matchRoom;
		this.matchInfo = matchInfo;
		this.status = status;
		this.result = result;
		this.tournament = tournament;
	}

	public User getFirst() {
		return first;
	}

	public void setFirst(User first) {
		this.first = first;
	}

	public User getSecond() {
		return second;
	}

	public void setSecond(User second) {
		this.second = second;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public Room getMatchRoom() {
		return matchRoom;
	}

	public void setMatchRoom(Room matchRoom) {
		this.matchRoom = matchRoom;
	}

	public MatchInfo getMatchInfo() {
		return matchInfo;
	}

	public void setMatchInfo(MatchInfo matchInfo) {
		this.matchInfo = matchInfo;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
}

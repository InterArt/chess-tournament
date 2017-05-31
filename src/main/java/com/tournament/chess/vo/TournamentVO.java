package com.tournament.chess.vo;

import java.time.*;
import java.util.*;

/**
 * Created by admin on 5/10/17.
 */
public class TournamentVO extends BaseVO {

	private int id;

	private String name;

	private LocalDate start;

	private LocalDate end;

	private String status;

	private List<MatchVO> matches;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<MatchVO> getMatches() {
		return matches;
	}

	public void setMatches(List<MatchVO> matches) {
		this.matches = matches;
	}
}

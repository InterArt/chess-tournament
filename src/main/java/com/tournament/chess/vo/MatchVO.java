package com.tournament.chess.vo;

import java.time.*;

/**
 * Created by admin on 5/10/17.
 */
public class MatchVO extends BaseVO {

	private int id;
	private Player first;
	private Player second;
	private LocalTime matchDate;
	private String room;
	private String status;
	private String result;
	private String pgn;
	private String pgnSource;
	private String mediaName;
	private String mediaSource;
	private String mediaType;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getFirst() {
		return first;
	}

	public void setFirst(Player first) {
		this.first = first;
	}

	public Player getSecond() {
		return second;
	}

	public void setSecond(Player second) {
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

	public String getPgn() {
		return pgn;
	}

	public void setPgn(String pgn) {
		this.pgn = pgn;
	}

	public String getPgnSource() {
		return pgnSource;
	}

	public void setPgnSource(String pgnSource) {
		this.pgnSource = pgnSource;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getMediaSource() {
		return mediaSource;
	}

	public void setMediaSource(String mediaSource) {
		this.mediaSource = mediaSource;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

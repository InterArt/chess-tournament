package com.tournament.chess.dto;

/**
 * Created by admin on 5/10/17.
 */
public class MatchInfoDto extends BaseDto {

	private int id;

	private String pgn;

	private String pgnSource;

	private MediaDto media;

	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public MediaDto getMedia() {
		return media;
	}

	public void setMedia(MediaDto media) {
		this.media = media;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

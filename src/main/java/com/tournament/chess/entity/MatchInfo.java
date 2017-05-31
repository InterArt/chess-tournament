package com.tournament.chess.entity;

/**
 * Created by admin on 3/23/17.
 */
public class MatchInfo extends BaseEntity {

	private String pgn;

	private String pgnSource;

	private Media media;

	private String description;

	public MatchInfo() {
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

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

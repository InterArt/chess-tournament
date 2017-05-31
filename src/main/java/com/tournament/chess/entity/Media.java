package com.tournament.chess.entity;

import javax.validation.constraints.*;

/**
 * Created by admin on 3/23/17.
 */
public class Media extends BaseEntity{

	@NotNull
	private String name;

	@NotNull
	private String source;

	@NotNull
	private MediaType mediaType;

	public Media() {
	}

	public Media(String name, String source, MediaType mediaType) {
		this.name = name;
		this.source = source;
		this.mediaType = mediaType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
}

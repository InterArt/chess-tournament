package com.tournament.chess.entity;

/**
 * Created by admin on 3/22/17.
 */
import org.springframework.data.annotation.*;

public abstract class BaseEntity {

	@Id
	protected int id;

	private Long dateAdded;
	private Long dateEdited;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public Long getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Long dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Long getDateEdited() {
		return dateEdited;
	}

	public void setDateEdited(Long dateEdited) {
		this.dateEdited = dateEdited;
	}

}

package com.tournament.chess.repository.seq;

/**
 * Created by admin on 3/29/17.
 */
public interface SequenceRepository {

	public int getNextSequenceId(String key) throws SequenceException ;
}

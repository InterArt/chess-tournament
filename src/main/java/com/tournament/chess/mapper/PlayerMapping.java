package com.tournament.chess.mapper;

import com.tournament.chess.entity.*;
import com.tournament.chess.mapper.config.*;
import com.tournament.chess.vo.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

/**
 * Created by admin on 3/22/17.
 */
@Component
public class PlayerMapping extends ConverterConfigurerSupport<User, Player> {

	@Override
	protected Converter<User, Player> converter() {

		return new AbstractConverter<User, Player>() {
			@Override
			protected Player convert(User source) {
				return new Player(source.getId(), String.format("%s %s", source.getFirstName(), source.getLastName()), source.getTeam());
			}
		};
	}
}

package com.tournament.chess.mapper;

import com.tournament.chess.entity.*;
import com.tournament.chess.mapper.config.*;
import com.tournament.chess.vo.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

import java.time.*;

/**
 * Created by admin on 5/15/17.
 */
@Component
public class MatchMapping extends ConverterConfigurerSupport<Match, MatchVO> {

	@Override
	protected Converter<Match, MatchVO> converter() {

		return new AbstractConverter<Match, MatchVO>() {
			@Override
			protected MatchVO convert(Match source) {
				MatchVO matchVO = new MatchVO();
				/*matchVO.setId(source.getId());
				//matchVO.setMatchDate(LocalTime.);
				//push into match VO Match#MatchInfo
				if (source.getMatchInfo() != null) {
					matchVO.setDescription(source.getMatchInfo().getDescription());
					matchVO.setPgn(source.getMatchInfo().getPgn());
					matchVO.setPgnSource(source.getMatchInfo().getPgnSource());
					//push into match VO  media info if there are exists
					if (source.getMatchInfo().getMedia() != null) {
						matchVO.setMediaName(source.getMatchInfo().getMedia().getName());
						matchVO.setMediaSource(source.getMatchInfo().getMedia().getSource());
						if (source.getMatchInfo().getMedia().getMediaType() != null) {
							matchVO.setMediaType(source.getMatchInfo().getMedia().getMediaType().toString());
						}
					}
				}*/


				return matchVO;

			}
		};
	}
}

package com.tournament.chess.common.util;

import java.time.*;
import java.util.*;

/**
 * Created by admin on 5/15/17.
 */
public class DateUtil {

	public static LocalTime convertToLocalTime(Date date) {
		if (date == null) return null;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return LocalTime.of(calendar.get(Calendar.HOUR), Calendar.MINUTE, Calendar.SECOND, Calendar.MILLISECOND);
	}

	public static LocalDate convertToLocalDate(Date date) {
		if (date == null) return null;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return LocalDate.of(calendar.get(Calendar.YEAR), Calendar.MONTH, Calendar.DAY_OF_MONTH);
	}
}

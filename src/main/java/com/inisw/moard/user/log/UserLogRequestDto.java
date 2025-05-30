package com.inisw.moard.user.log;

import java.time.ZonedDateTime;
import java.util.UUID;

public record UserLogRequestDto(
	UUID userId,
	EventType eventType,
	Long contentId,
	Long recommendationId,
	ZonedDateTime timestamp,
	Integer time,
	Float ratio
) {
}
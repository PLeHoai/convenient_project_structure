package com.convpack.datetime;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZoneId;
import java.time.ZoneOffset;

@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class CvpTimezone
{
    private ZoneOffset zoneOffset;
    private ZoneId zoneId;
}

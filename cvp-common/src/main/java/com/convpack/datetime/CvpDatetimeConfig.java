package com.convpack.datetime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;

@Configuration
public class CvpDatetimeConfig
{
    @Bean
    public CvpTimezone cvpTimezone(Environment  environment)
    {
        String prefix = environment.getProperty("app.datetime.prefix");
        Integer zoneOffset = environment.getProperty("app.datetime.zone-offset", Integer.class);
        assert prefix != null;
        assert zoneOffset != null;

        ZoneOffset z = ZoneOffset.ofHours(zoneOffset);
        ZoneId zoneId = ZoneId.ofOffset(prefix, z);

        TimeZone.setDefault(
                TimeZone.getTimeZone(zoneId)
        );

        return CvpTimezone.builder()
                .zoneId(zoneId)
                .zoneOffset(z)
                .build();
    }
}

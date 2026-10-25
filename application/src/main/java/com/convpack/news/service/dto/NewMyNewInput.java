package com.convpack.news.service.dto;

import com.convpack.repo.CvpSnapUserInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class NewMyNewInput
{
    private String title;
    private String content;

    private CvpSnapUserInfo createdBy;
    private OffsetDateTime createdAt;
}

package com.convpack.news.service.dto;

import com.convpack.news.repo.model.MyNew;
import com.convpack.repo.CvpSnapUserInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class UpdateMyNewInput
{
    private MyNew myNew;

    private String title;
    private String content;

    private CvpSnapUserInfo updatedBy;
    private OffsetDateTime updatedAt;
}

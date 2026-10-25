package com.convpack.news.repo.model;

import com.convpack.repo.CvpSnapUserInfo;
import lombok.*;

import java.time.OffsetDateTime;

@Builder(access = AccessLevel.PACKAGE, toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@Setter(AccessLevel.PACKAGE)
public class MyNew
{
    private String id;
    private String title;
    private String content;

    private CvpSnapUserInfo createdBy;
    private String createdById;
    private OffsetDateTime createdAt;

    private CvpSnapUserInfo updatedBy;
    private String updatedById;
    private OffsetDateTime updatedAt;
}

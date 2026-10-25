package com.convpack.news.usecase;

import com.convpack.news.controller.dto.CreateMyNewReq;
import com.convpack.news.repo.model.MyNew;
import com.convpack.user.CvpUserInfo;

import java.time.OffsetDateTime;

public interface UcCreateMyNewByUser
{
    MyNew create(CreateMyNewReq req, CvpUserInfo userInfo, OffsetDateTime reqTime);
}

package com.convpack.news.usecase;

import com.convpack.news.controller.dto.CreateMyNewReq;
import com.convpack.news.repo.MyNewRepo;
import com.convpack.news.repo.model.MyNew;
import com.convpack.news.service.MyNewService;
import com.convpack.user.CvpUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Slf4j
@Service
class UcCreateMyNewByUserImpl implements UcCreateMyNewByUser
{
    private final MyNewRepo myNewRepo;
    private final MyNewService myNewService;

    @Autowired
    public UcCreateMyNewByUserImpl(
            MyNewRepo myNewRepo,
            MyNewService myNewService
    )
    {
        this.myNewRepo = myNewRepo;
        this.myNewService = myNewService;
    }

    @Override
    public MyNew create(CreateMyNewReq req, CvpUserInfo userInfo, OffsetDateTime reqTime) {
        return null;
    }
}

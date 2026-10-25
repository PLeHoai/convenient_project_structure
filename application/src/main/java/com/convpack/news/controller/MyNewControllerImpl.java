package com.convpack.news.controller;

import com.convpack.news.controller.dto.CreateMyNewReq;
import com.convpack.news.controller.dto.MyNewRes;
import com.convpack.news.usecase.UcCreateMyNewByUser;
import com.convpack.user.CvpUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyNewControllerImpl implements MyNewController
{
    private final UcCreateMyNewByUser ucCreateMyNewByUser;

    @Autowired
    public MyNewControllerImpl(
            UcCreateMyNewByUser ucCreateMyNewByUser
    )
    {
        this.ucCreateMyNewByUser = ucCreateMyNewByUser;
    }

    @Override
    public ResponseEntity<MyNewRes> getProductById(CvpUserInfo userInfo, CreateMyNewReq reqBody) {
        return null;
    }
}

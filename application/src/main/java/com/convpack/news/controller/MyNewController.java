package com.convpack.news.controller;

import com.convpack.news.controller.dto.CreateMyNewReq;
import com.convpack.news.controller.dto.MyNewRes;
import com.convpack.user.CvpUserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/news")
public interface MyNewController
{
    @GetMapping(path = "/{id}/instance")
    ResponseEntity<MyNewRes> getProductById(
            @AuthenticationPrincipal CvpUserInfo userInfo,
            @RequestBody CreateMyNewReq reqBody
    );
}

package com.convpack.news.controller;

import com.convpack.news.controller.dto.ProductRes;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/v1/products")
public interface ProductController
{
    @GetMapping(path = "/{id}/instance")
    ResponseEntity<ProductRes> getProductById(
            @AuthenticationPrincipal
    )
}

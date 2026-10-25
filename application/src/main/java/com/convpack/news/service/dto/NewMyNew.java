package com.convpack.news.service.dto;

import com.convpack.news.repo.model.MyNew;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class NewMyNew
{
    private MyNew myNew;

}

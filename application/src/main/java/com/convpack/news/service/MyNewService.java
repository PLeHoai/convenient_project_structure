package com.convpack.news.service;

import com.convpack.news.repo.model.MyNew;
import com.convpack.news.service.dto.NewMyNew;
import com.convpack.news.service.dto.NewMyNewInput;
import com.convpack.news.service.dto.UpdatedMyNew;

import java.util.List;

public interface MyNewService
{
    NewMyNew newMyNew(NewMyNewInput input);

    UpdatedMyNew updatedMyNew(UpdatedMyNew input);

    MyNew saveMyNew(MyNew myNew);

    List<MyNew> saveMyNews(Iterable<MyNew> myNews);
}

package com.convpack.news.service;

import com.convpack.news.repo.MyNewRepo;
import com.convpack.news.repo.model.MyNew;
import com.convpack.news.service.dto.NewMyNew;
import com.convpack.news.service.dto.NewMyNewInput;
import com.convpack.news.service.dto.UpdatedMyNew;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
class MyNewServiceImpl implements MyNewService
{
    private final MyNewRepo myNewRepo;

    @Autowired
    public MyNewServiceImpl(MyNewRepo myNewRepo)
    {
        this.myNewRepo = myNewRepo;
    }

    @Override
    public NewMyNew newMyNew(NewMyNewInput input) {
        return null;
    }

    @Override
    public UpdatedMyNew updatedMyNew(UpdatedMyNew input) {
        return null;
    }

    @Override
    public MyNew saveMyNew(MyNew myNew) {
        return null;
    }

    @Override
    public List<MyNew> saveMyNews(Iterable<MyNew> myNews) {
        return List.of();
    }
}

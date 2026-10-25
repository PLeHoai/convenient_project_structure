package com.convpack.news.repo;

import com.convpack.news.repo.model.MyNew;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

//provide the
public interface MyNewRepo
{
    Optional<MyNew> findById(@NotNull String id);

    List<MyNew> findAll();

    MyNew save(@NotNull MyNew myNew);
    void delete(@NotNull String id);
}

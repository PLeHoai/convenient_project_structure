package com.convpack.news.repo;

import com.convpack.news.repo.model.MyNew;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
class MyNewRepoImpl implements MyNewRepo
{
    //EntityManager
    //MongoTemplate
    //Neo4jTemplate
    //.etc


    @Override
    public Optional<MyNew> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<MyNew> findAll() {
        return List.of();
    }

    @Override
    public MyNew save(MyNew myNew) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

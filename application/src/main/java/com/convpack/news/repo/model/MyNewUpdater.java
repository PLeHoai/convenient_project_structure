package com.convpack.news.repo.model;

import com.convpack.repo.CvpSnapUserInfo;
import com.convpack.repo.RepoModelUpdater;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;


@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class MyNewUpdater implements RepoModelUpdater<MyNew> {
    private String title;
    private String content;

    private CvpSnapUserInfo updatedBy;
    private OffsetDateTime updatedAt;

    @NotNull
    private MyNew myNew;

    private void isValid()
    {

    }

    @Override
    public MyNew update() {
        this.isValid();

        MyNew.MyNewBuilder builder = this.myNew.toBuilder();
        builder.title(this.title);

        return builder.build();
    }
}

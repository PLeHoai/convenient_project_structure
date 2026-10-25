package com.convpack.news.repo.model;

import com.convpack.repo.CvpSnapUserInfo;
import com.convpack.repo.RepoModelCreator;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochRandomGenerator;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.time.OffsetDateTime;
import java.time.ZoneId;

@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class MyNewCreator implements RepoModelCreator<MyNew>
{
    private final TimeBasedEpochRandomGenerator generator = Generators.timeBasedEpochRandomGenerator();

    private String title;
    private String content;

    private CvpSnapUserInfo createdBy;
    private String createdById;
    private OffsetDateTime createdAt;

    private void isValid()
    {
        if(!StringUtils.hasText(this.title))
        {

        }
        if(!StringUtils.hasLength(this.content))
        {

        }
        if(this.createdBy==null)
        {

        }
    }

    @Override
    public MyNew create() {
        this.isValid();

        String id = generator.generate().toString();
        String createdById = this.createdBy.getId();
        OffsetDateTime createdAt = this.createdAt != null ?
                this.createdAt :
                OffsetDateTime.now(
                        ZoneId.systemDefault()
                );

        MyNew model = MyNew.builder()
                .id(id)
                .title(this.title)
                .content(this.content)
                .createdBy(this.createdBy)
                .createdAt(this.createdAt)
                .createdById(createdById)
                .createdAt(createdAt)
                .build();

        return model;
    }
}

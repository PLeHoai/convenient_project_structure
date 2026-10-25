package com.convpack.user;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@Setter(AccessLevel.PACKAGE)
@Builder(toBuilder = true)
public class CvpUserInfo
{
    private String id;
    private String username;
    private Integer age;
    private LocalDate birthday;
    private String email;
}

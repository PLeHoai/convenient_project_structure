package com.convpack.repo;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder(toBuilder = true)
@Getter
@Setter(AccessLevel.PACKAGE)
public class CvpSnapUserInfo
{
    @NotBlank
    private String id;
    @NotBlank
    private String username;
//    @NotBlank
    private String role;
}

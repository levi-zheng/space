package com.levizheng.space.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author levi
 * @since 2023/4/25
 */
@Data
public class RegisterDTO {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}

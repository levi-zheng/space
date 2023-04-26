package com.levizheng.space.model.entity;

import lombok.Data;

/**
 * @author levi
 * @since 2023/4/25
 */
@Data
public class User extends BaseEntity {

    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String email;


}

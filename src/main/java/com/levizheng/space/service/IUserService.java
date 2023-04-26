package com.levizheng.space.service;

import com.levizheng.space.model.dto.RegisterDTO;

/**
 * @author levi
 * @since 2023/4/25
 */
public interface IUserService {

    /**
     * 用户注册
     *
     * @param registerDTO
     */
    void register(RegisterDTO registerDTO);
}

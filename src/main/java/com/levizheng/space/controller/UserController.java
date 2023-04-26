package com.levizheng.space.controller;

import com.levizheng.space.model.dto.RegisterDTO;
import com.levizheng.space.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author levi
 * @since 2023/4/25
 */
@AllArgsConstructor
@RequestMapping("user")
public class UserController {

    private final IUserService userService;

    @PostMapping("register")
    public void register(@RequestBody RegisterDTO registerDTO) {
        this.userService.register(registerDTO);


    }


}

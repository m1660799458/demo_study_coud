package com.george.springcloud.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class User {
    private String id;

//    @NotNull(message = "用户输入的手机号不可为空")
    private String userName;
//    @IsMobile
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
}

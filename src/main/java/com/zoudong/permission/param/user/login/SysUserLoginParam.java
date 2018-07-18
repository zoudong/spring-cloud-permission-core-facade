package com.zoudong.permission.param.user.login;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUserLoginParam implements Serializable{
    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

}
package com.zoudong.permission.api;


import com.github.pagehelper.PageInfo;
import com.zoudong.permission.param.user.login.SysUserLoginParam;
import com.zoudong.permission.param.user.query.QuerySysUserParam;
import com.zoudong.permission.result.base.BaseResult;
import com.zoudong.permission.result.user.SysUserVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@FeignClient(value = "PERMISSION-SYSTEAM")
public interface UserService {

    @RequestMapping(value = "/permission/apiLogin", method = RequestMethod.POST)
    public BaseResult<String> apiLogin(@Valid @RequestBody SysUserLoginParam sysUserLoginParam)throws Exception;

    @RequestMapping(value = "/permission/querySysUserByPage", method = RequestMethod.POST)
    public  BaseResult<PageInfo<SysUserVO>> test(@Valid @RequestBody QuerySysUserParam querySysUserParam)throws Exception;

}

package com.zoudong.permission.result.user;


import com.zoudong.permission.result.permission.SysPermissionVO;
import com.zoudong.permission.result.role.SysRoleVO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SysUserVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String header;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 性别（1：男 2：女）
     */
    private Integer sex;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;


    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 状态(1：启用  2：冻结  3：删除）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 乐观锁版本号
     */
    private Long version;

    private List<SysRoleVO> roleList;



    private List<SysPermissionVO> permissionList;


    /**
     * 用户类型
     */
    private Integer userType;




}
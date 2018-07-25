package com.zoudong.permission.result.role;


import com.zoudong.permission.result.permission.SysPermissionVO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SysRoleVO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 父角色id
     */
    private Long parentId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色名称
     */
    private String roleCode;

    /**
     * 角色描述
     */
    private String roleDescription;

    /**
     * 保留字段
     */
    private Long version;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;



    private List<SysPermissionVO> sysPermissions;


}
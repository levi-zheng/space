package com.levizheng.space.model.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author levi
 * @since 2023/4/25
 */
@Getter
@Setter
public class BaseEntity {

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private String updateTime;
}

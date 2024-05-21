package com.cyshop.customer.vo;

import com.cyshop.customer.valueobject.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname UserVO
 * @Description TODO
 * @Date 2024/5/21 18:19
 * @Created by 陈义
 */
@Data
@ApiModel(description = "用户VO实体")
public class UserVO {
    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("详细信息")
    private String info;

    @ApiModelProperty("使用状态（1正常 2冻结）")
    private UserStatus status;

    @ApiModelProperty("账户余额")
    private Integer balance;
}

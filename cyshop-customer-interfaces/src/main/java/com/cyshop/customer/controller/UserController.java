package com.cyshop.customer.controller;

import com.cyshop.customer.converter.IUserConverter;
import com.cyshop.customer.dto.PageDTO;
import com.cyshop.customer.dto.UserFormDTO;
import com.cyshop.customer.vo.UserQuery;
import com.cyshop.customer.vo.UserVO;
import com.cyshop.customer.entity.test.User;
import com.cyshop.customer.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname UserController
 * @Description 根据User表生成的示例接口，入参和返回值都没有规范，且数据传输也没有规范
 * @Date 2024/5/21 18:07
 * @Created by 陈义
 */
@Api(tags = "用户管理接口")
@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {

    private final IUserService userService;

    @PostMapping
    @ApiOperation("新增用户")
    public void saveUser(@RequestBody UserFormDTO userFormDTO){
        // 1.转换DTO为PO
        User user = IUserConverter.INSTANCT.dto2entity(userFormDTO);
        // 2.新增
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除用户")
    public void removeUserById(@PathVariable("id") Long userId){
        userService.removeById(userId);
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询用户")
    public UserVO queryUserById(@PathVariable("id") Long userId){
        // 1.查询用户
        User user = userService.getById(userId);
        // 2.处理vo
        return IUserConverter.INSTANCT.entity2vo(user);
    }

    @GetMapping
    @ApiOperation("根据id集合查询用户")
    public List<UserVO> queryUserByIds(@RequestParam("ids") List<Long> ids){
        // 1.查询用户
        List<User> users = userService.listByIds(ids);
        // 2.处理vo
        return IUserConverter.INSTANCT.sourceListToTargetList(users);
    }

    /** 
    * @Description: 通用分页查询接口
    * @Author: chenyi
    * @Date: 2024/5/22 
    */ 
    @GetMapping("/page")
    @ApiOperation("通用分页查询接口")
    public PageDTO<UserVO> queryUsersPage(UserQuery query){
        return userService.queryUsersPage(query);
    }
}

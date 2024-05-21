package com.cyshop.customer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyshop.customer.dto.PageDTO;
import com.cyshop.customer.entity.test.User;
import com.cyshop.customer.vo.PageQuery;
import com.cyshop.customer.vo.UserVO;

/**
 * @Classname IUserService
 * @Description TODO
 * @Date 2024/5/21 18:23
 * @Created by 陈义
 */
public interface IUserService extends IService<User> {

    PageDTO<UserVO> queryUsersPage(PageQuery query);
}

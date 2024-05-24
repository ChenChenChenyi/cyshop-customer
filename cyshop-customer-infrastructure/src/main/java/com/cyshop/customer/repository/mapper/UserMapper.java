package com.cyshop.customer.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyshop.customer.entity.test.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2024/5/21 0:44
 * @Created by 陈义
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User queryById(Long id);
}

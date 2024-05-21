package com.cyshop.customer.repository.impl;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyshop.customer.converter.IUserConverter;
import com.cyshop.customer.dto.PageDTO;
import com.cyshop.customer.entity.test.User;
import com.cyshop.customer.repository.mapper.UserMapper;
import com.cyshop.customer.service.IUserService;
import com.cyshop.customer.vo.PageQuery;
import com.cyshop.customer.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2024/5/22 0:20
 * @Created by 陈义
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public PageDTO<UserVO> queryUsersPage(PageQuery query){
        // 1.构建条件
        // 1.1.分页条件
        Page<User> page = Page.of(query.getPageNo(), query.getPageSize());
        // 1.2.排序条件
        if (query.getSortBy() != null) {
            page.addOrder(new OrderItem(query.getSortBy(), query.getIsAsc()));
        }else{
            // 默认按照更新时间排序
            page.addOrder(new OrderItem("update_time", false));
        }
        // 2.查询
        page(page);
        // 3.数据非空校验
        List<User> records = page.getRecords();
        if (records == null || records.size() <= 0) {
            // 无数据，返回空结果
            return new PageDTO<>(page.getTotal(), page.getPages(), Collections.emptyList());
        }
        // 4.有数据，转换
        List<UserVO> list = IUserConverter.INSTANCT.sourceListToTargetList(records);
        // 5.封装返回
        return new PageDTO<UserVO>(page.getTotal(), page.getPages(), list);
    }
}

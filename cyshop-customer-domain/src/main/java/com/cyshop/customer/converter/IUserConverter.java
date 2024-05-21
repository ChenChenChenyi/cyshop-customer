package com.cyshop.customer.converter;

import com.cyshop.customer.dto.UserFormDTO;
import com.cyshop.customer.entity.test.User;
import com.cyshop.customer.valueobject.UserStatus;
import com.cyshop.customer.vo.UserVO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Classname IUserMapper
 * @Description TODO
 * @Date 2024/5/22 0:55
 * @Created by 陈义
 */
@Mapper
public interface IUserConverter {
    IUserConverter INSTANCT = Mappers.getMapper(IUserConverter.class);

    User dto2entity(UserFormDTO userFormDTO);

    UserVO entity2vo(User user);

    @IterableMapping(elementTargetType = User.class)
    List<UserVO> sourceListToTargetList(List<User> sourceList);

}

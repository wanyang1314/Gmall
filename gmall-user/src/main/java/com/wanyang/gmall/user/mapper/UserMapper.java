package com.wanyang.gmall.user.mapper;

import com.wanyang.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();

    UmsMember selectUserById(int id);

    int addUser(UmsMember umsMember);

    int deleteUser(int id);

    int updateUser(int id);
}

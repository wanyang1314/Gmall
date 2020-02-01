package com.wanyang.gmall.user.service;

import com.wanyang.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    UmsMember getUserById(int id);
    int addUser(UmsMember umsMember);
    int deleteUser(int id);
    int updateUser(int id);
}

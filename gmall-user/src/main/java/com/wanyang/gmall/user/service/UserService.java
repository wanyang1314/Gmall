package com.wanyang.gmall.user.service;

import com.wanyang.gmall.user.bean.UmsMember;
import com.wanyang.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    UmsMember getUserById(String id);
    int addUser(UmsMember umsMember);
    int deleteUser(String id);
    int updateUser(UmsMember umsMember);

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}

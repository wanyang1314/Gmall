package com.wanyang.gmall.user.service.impl;

import com.wanyang.gmall.user.bean.UmsMember;
import com.wanyang.gmall.user.mapper.UserMapper;
import com.wanyang.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public UmsMember getUserById(int id) {
        UmsMember umsMember=userMapper.selectUserById(id);
        return umsMember;
    }

    @Override
    public int addUser(UmsMember umsMember) {
        int i=userMapper.addUser(umsMember);
        return i;
    }

    @Override
    public int deleteUser(int id) {
        int i=userMapper.deleteUser(id);
        return i;
    }

    @Override
    public int updateUser(int id) {
        int i=userMapper.updateUser(id);
        return i;
    }
}

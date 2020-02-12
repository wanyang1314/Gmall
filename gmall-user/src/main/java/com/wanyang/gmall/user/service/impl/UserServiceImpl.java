package com.wanyang.gmall.user.service.impl;

import com.wanyang.gmall.user.bean.UmsMember;
import com.wanyang.gmall.user.bean.UmsMemberReceiveAddress;
import com.wanyang.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.wanyang.gmall.user.mapper.UserMapper;
import com.wanyang.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public UmsMember getUserById(String id) {
        UmsMember umsMember=userMapper.selectByPrimaryKey(id);
        return umsMember;
    }

    @Override
    public int addUser(UmsMember umsMember) {
        int i=userMapper.insert(umsMember);
        return i;
    }

    @Override
    public int deleteUser(String id) {
        int i=userMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int updateUser(UmsMember umsMember) {
        int i=userMapper.updateByPrimaryKey(umsMember);
        return i;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }
}

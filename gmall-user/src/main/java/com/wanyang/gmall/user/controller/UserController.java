package com.wanyang.gmall.user.controller;

import com.wanyang.gmall.user.bean.UmsMember;
import com.wanyang.gmall.user.bean.UmsMemberReceiveAddress;
import com.wanyang.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList=userService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping("getUser")
    @ResponseBody
    public UmsMember getUser(){
        UmsMember umsMember=userService.getUserById("4");
        return umsMember;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Hello User!";
    }
}

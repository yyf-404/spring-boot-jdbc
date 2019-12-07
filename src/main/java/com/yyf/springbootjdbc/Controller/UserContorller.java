package com.yyf.springbootjdbc.Controller;

import com.yyf.springbootjdbc.bean.User;
import com.yyf.springbootjdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserContorller {
    @Autowired
    UserMapper userMapper;
    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
       User user= userMapper.getUserById(id);
        return user;
    }
    @ResponseBody
    @GetMapping("/user")
    public User saveUser( User user){
      userMapper.insertUser(user);
        return user;
    }
}

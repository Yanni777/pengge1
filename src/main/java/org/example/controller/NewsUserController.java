package org.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.domain.NewsUser;
import org.example.service.NewsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hp
 */
@RestController
@RequestMapping("/user")
public class NewsUserController {
    @Autowired
    private NewsUserService newsUserService;
    @GetMapping("/getNickName")
    public String getUser(@RequestParam String username) {
        QueryWrapper<NewsUser> queryWrapper = new QueryWrapper<NewsUser>().eq("username", username);
        return newsUserService.getOne(queryWrapper).getNickName();
    }
}

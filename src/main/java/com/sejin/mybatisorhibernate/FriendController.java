package com.sejin.mybatisorhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class FriendController {
    FriendService friendService;

    @Autowired
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @ResponseBody
    @RequestMapping("/friends")
    public List<Friend> getFriends() {
        return friendService.findAll();
    }
}

package com.sejin.mybatisorhibernate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class FriendController {

    @ResponseBody
    @RequestMapping("/friends")
    public List<Friend> getFriends() {
        // TODO: Get data from database
        List<Friend> friendList = new ArrayList<>();
        friendList.add( new Friend(1, "전세진", 27, "모솔"));
        return friendList;
    }
}

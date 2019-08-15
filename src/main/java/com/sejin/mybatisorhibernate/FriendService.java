package com.sejin.mybatisorhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FriendService {
    private FriendMapper friendMapper;

    @Autowired
    public FriendService(FriendMapper friendMapper) {
        this.friendMapper = friendMapper;
    }

    public List<Friend> findAll() {
        return friendMapper.findAll();
    }
}

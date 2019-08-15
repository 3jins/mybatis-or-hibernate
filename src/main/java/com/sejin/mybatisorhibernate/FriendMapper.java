package com.sejin.mybatisorhibernate;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FriendMapper {
    /* create */
    @Insert("INSERT INTO friend VALUES (#{friendId}, #{name}, #{age}, #{characteristic}")
    void insert(Friend friend);

    /* read */
    @Select("SELECT * FROM friend")
    List<Friend> getAll();
    @Select("SELECT * FROM friend WHERE id")
    Friend getById(long id);
    // Friend getByName(String name);

    /* update */
    // void updateName(long id, String name);
    // void updateAge(long id, int age);
    // void updateCharacteristic(long id, String characteristic);

    /* delete */
    // void deleteById(long id);
}

package com.sejin.mybatisorhibernate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Friend {
    private int friendId;
    private String name;
    private int age;
    private String characteristic;
}

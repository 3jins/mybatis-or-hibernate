package com.sejin.mybatisorhibernate;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Friend extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "friend_id", nullable = false)
    private long friendId;

    @Column(length = 127, nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(length = 255)
    @Setter
    private String characteristic = null;

    @Builder
    public Friend(String name, int age, String characteristic) {
        this.name = name;
        this.age = age;
        this.characteristic = characteristic;
    }
}

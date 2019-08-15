package com.sejin.mybatisorhibernate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendRepositoryTests {
    @Autowired
    private FriendRepository friendRepository;
    private Friend newFriend = Friend.builder()
            .name("WYH")
            .age(27)
            .characteristic("souless")
            .build();

    @Before
    public void addNewFriend() {
        friendRepository.save(newFriend);
    }

    @After
    public void cleanUp() {
        friendRepository.delete(newFriend);
    }

    @Test
    public void saveAndLoad() {
        List<String> friendNames = new ArrayList<>();
        friendNames.add("전세진");
        friendNames.add("LJH");
        friendNames.add("JJW");
        friendNames.add("BSD");
        friendNames.add("WYH");

        List<Friend> friends = friendRepository.findAll();
        int friendIdx = 0;
        for (Friend friend : friends) {
            assert (friend.getName().equals(friendNames.get(friendIdx)));
            System.out.println(friend.getCreatedAt());
            friendIdx++;
        }
    }

    @Test
    public void shouldChangeUpdatedAtAfterUpdate() throws InterruptedException {
        Thread.sleep(2000);

        Friend brandNewFriend = friendRepository.findByName("WYH").get(0);
        brandNewFriend.setCharacteristic("much more souless");
        friendRepository.save(brandNewFriend);

        Friend updatedFriend = friendRepository.findByName("WYH").get(0);
        assert (updatedFriend.getCreatedAt().getSecond() < updatedFriend.getUpdatedAt().getSecond());
    }

}

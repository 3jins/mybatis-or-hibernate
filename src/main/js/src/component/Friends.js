import _ from 'lodash';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default () => {
  const [friends, setFriends] = useState([]);
  const [isFriendsEmpty, setIsFriendsEmpty] = useState(false);

  useEffect(() => {
    axios
      .get('/friends')
      .then((response) => {
        const { data } = response;
        if (_.isEmpty(data)) setIsFriendsEmpty(true);
        else setIsFriendsEmpty(false);
        setFriends(data);
      })
      .catch(err => console.error(err));
  }, []);

  const render = () => {
    if (isFriendsEmpty) return <p>친구가 없어여 ㅠㅠ</p>;
    if (_.isEmpty(friends)) return <p>Loading...</p>;
    return friends.map((friend) => {
      const {
        friendId,
        name,
        age,
        characteristic,
        createdAt,
        updatedAt,
      } = friend;
      return (
        <div key={friendId}>
          <p>이름: {name}</p>
          <p>나이: {age}</p>
          <p>특징: {characteristic}</p>
          <p>생성: {createdAt}</p>
          <p>수정: {updatedAt}</p>
        </div>
      );
    });
  };

  return (
    <div className="friends">
      {render()}
    </div>
  );
};

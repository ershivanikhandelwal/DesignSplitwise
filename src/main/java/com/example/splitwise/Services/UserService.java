package com.example.splitwise.Services;

import com.example.splitwise.Exceptions.UserNotFoundException;
import com.example.splitwise.Models.User;
import com.example.splitwise.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository _userRepository;
    public User createUser(User usr)
    {
        return _userRepository.save(usr);
    }

    public List<User> getUsersByIds(List<Long> userIds)
    {
        return _userRepository.findAllById(userIds);
    }

    public User getUserById(Long userId)
    {
        return _userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException(userId));
    }
}

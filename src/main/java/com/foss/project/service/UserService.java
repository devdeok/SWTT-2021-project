package com.foss.project.service;

import com.foss.project.model.User;
import com.foss.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<User> 모든사용자조회(){
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    public String 사용자이름조회(long user_id){
        return userRepository.사용자이름조회(user_id);
    }


}

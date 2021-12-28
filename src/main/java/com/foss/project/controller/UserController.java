package com.foss.project.controller;

import com.foss.project.dto.CMRespDto;
import com.foss.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public CMRespDto<?> 모든사용자조회(){
        return new CMRespDto<>(1, userService.모든사용자조회());
    }

    @GetMapping("/username")
    public CMRespDto<?> 사용자이름조회(long user_id) { return new CMRespDto<>(1, userService.사용자이름조회(user_id)); }

}
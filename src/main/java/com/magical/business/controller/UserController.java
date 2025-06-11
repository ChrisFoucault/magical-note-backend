package com.magical.business.controller;
import com.magical.business.entity.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "用户管理", description = "提供用户的增删改查 API")
public class UserController {

    @PostMapping("/login")
    public String login(User user) {
        String a = "123";
        return a;
    }

}

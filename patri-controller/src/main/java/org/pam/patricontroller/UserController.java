package org.pam.patricontroller;

import lombok.RequiredArgsConstructor;
import org.pam.patripojo.request.AddUserRequest;
import org.pam.patripojo.response.AddUserResponse;
import org.pam.patriservice.UserService;
import org.pam.patriservice.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/s")
public class UserController {
    private final UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @PostMapping("/s/c")
    public ResponseEntity<AddUserResponse> createUser(@RequestBody AddUserRequest addUserRequest) {
        return new ResponseEntity<>(userService.createUser(addUserRequest), HttpStatus.OK);
    }
}

package org.pam.patriservice;

import org.pam.patripojo.request.AddUserRequest;
import org.pam.patripojo.response.AddUserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {
    public AddUserResponse createUser(@RequestBody AddUserRequest addUserRequest);
}

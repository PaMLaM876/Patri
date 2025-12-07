package org.pam.patriservice.impl;

import org.pam.patripersistence.UserDao;
import org.pam.patripersistence.dto.UserDTO;
import org.pam.patripojo.request.AddUserRequest;
import org.pam.patripojo.response.AddUserResponse;
import org.pam.patriservice.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public AddUserResponse createUser(AddUserRequest addUserRequest) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAadhar(addUserRequest.getAadhar());
        userDTO.setAge(addUserRequest.getAge());
        userDTO.setMail(addUserRequest.getMail());
        userDTO.setAddress(addUserRequest.getAddress());
        userDTO.setGender(addUserRequest.getGender());
        try {
            userDao.createUser(userDTO);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Failed");
            AddUserResponse addUserResponse = new AddUserResponse();
            addUserResponse.setMessage(e.getMessage());
            addUserResponse.setStatus(false);
            return addUserResponse;
        }
        AddUserResponse addUserResponse = new AddUserResponse();
        addUserResponse.setMessage("Success");
        addUserResponse.setStatus(true);
        return addUserResponse;
    }
}

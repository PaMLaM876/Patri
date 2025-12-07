package org.pam.patripersistence;

import org.pam.patripersistence.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserDTO,Long>{
    Optional<UserDTO> findByEmail(String email);
    void createUser(@RequestBody UserDTO userDTO);

}

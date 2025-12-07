package org.pam.patripersistence.dto;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.query.JpqlQueryBuilder;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor
@Entity @Table(name= "users")
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private long userid;
    @Column @NonNull
    private String username;
    @Column
    private String mail;
    @Column
    private String gender;
    @Column
    private String aadhar;
    @Column
    private String address;
    @Column
    private int age;
}

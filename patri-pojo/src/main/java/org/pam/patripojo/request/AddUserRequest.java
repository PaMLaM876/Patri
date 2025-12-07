package org.pam.patripojo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class AddUserRequest {
    @JsonProperty
    private long userid;

    @JsonProperty
    private String username;

    @JsonProperty
    private String mail;

    @JsonProperty
    private String gender;

    @JsonProperty
    private String aadhar;

    @JsonProperty
    private String address;

    @JsonProperty
    private int age;
}

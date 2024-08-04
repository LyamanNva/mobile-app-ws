package com.appsdeveloperblog.app.ws.mobile_app_ws.io.entity;
import java.io.Serializable;


public class UserEntity implements Serializable {
    private static final long serialVersionUID = -1823962317744376806L;

    private long id;

    private String userId;
    private String  firstName;
    private String lastName;
    private String email;
    private String encryptedPassword;
    private String emailVerificationToken;
    private String emailVerificationStatus;
}

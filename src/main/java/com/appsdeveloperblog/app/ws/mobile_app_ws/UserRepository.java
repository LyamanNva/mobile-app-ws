package com.appsdeveloperblog.app.ws.mobile_app_ws;

import com.appsdeveloperblog.app.ws.mobile_app_ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
    UserEntity findByEmail(String email);

}

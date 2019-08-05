package com.example.addressbook3.services;

import com.example.addressbook3.entity.User;


import java.util.Optional;

public interface UserService {


    void delete(Long id);

    User editUser(String name);


}

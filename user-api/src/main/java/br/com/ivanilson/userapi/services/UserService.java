package br.com.ivanilson.userapi.services;

import br.com.ivanilson.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}

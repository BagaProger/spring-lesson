package com.karataev.springbootlessonfour.services;

import com.karataev.springbootlessonfour.entities.User;
import com.karataev.springbootlessonfour.repositories.specifications.UserRepasitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepasitory repasitory;

    @Autowired
    public void setRepasitory(UserRepasitory repasitory) {
        this.repasitory = repasitory;
    }

    @Transactional
    public User createOrUpdate(User user){
        return repasitory.save(user);
    }

    @Transactional
    public Optional<User> findById(Long id){
        return  repasitory.findById(id);
    }

    @Transactional
    public List<User> findAll(){
        return repasitory.findAll();
    }

    @Transactional
    public void deleteById(Long id){
        repasitory.deleteById(id);
    }
}

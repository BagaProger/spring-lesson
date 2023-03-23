package com.karataev.springbootlessonfour.repositories.specifications;

import com.karataev.springbootlessonfour.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepasitory extends JpaRepository<User,Long> {
}

package com.nam.bk.repository;

import com.nam.bk.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Query("select u from User u")
    Page<User> findAllByCustomQueryAndStream(Pageable pageable);
}

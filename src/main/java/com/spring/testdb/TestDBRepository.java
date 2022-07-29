package com.spring.testdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDBRepository extends JpaRepository<Person, Integer> {

}

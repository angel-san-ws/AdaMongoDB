package com.adaschool.DB.Postgre.Test.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

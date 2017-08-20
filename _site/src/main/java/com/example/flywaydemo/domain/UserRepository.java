package com.example.flywaydemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajeevkumarsingh on 20/08/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

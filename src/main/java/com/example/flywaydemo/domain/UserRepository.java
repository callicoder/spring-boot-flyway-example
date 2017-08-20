package com.example.flywaydemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 20/08/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

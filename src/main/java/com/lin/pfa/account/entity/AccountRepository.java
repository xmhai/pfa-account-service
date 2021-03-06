package com.lin.pfa.account.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// use JpaRepository instead of CrudRepository because findAll() return List<>
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
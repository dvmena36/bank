package com.david.balance.repositories;

import com.david.balance.entities.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BalanceRepository extends JpaRepository<Balance,Long> {
    Optional<Balance> findByUserId(long userId);
}

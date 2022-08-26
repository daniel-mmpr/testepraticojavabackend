package com.senior.daniel.repository;

import com.senior.daniel.dto.OrderDTO;
import com.senior.daniel.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, UUID> {
}

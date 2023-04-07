package com.ecommerce.store.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.store.entity.OrderDetail;
import com.ecommerce.store.entity.User;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}

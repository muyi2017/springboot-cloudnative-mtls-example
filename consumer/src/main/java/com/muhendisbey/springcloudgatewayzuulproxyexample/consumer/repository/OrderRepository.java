/*
 * OrderRepository.java
 Author: Onur GURSOY (onur.gursoy@siemens.com)
 Created: 10/1/21 5:55 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.repository;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.OrderEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class OrderRepository implements IOrderRepository
{
    @Override
    public OrderEntity findById(int id)
    {
        return new OrderEntity()
                .setId(id)
                .setName("xbox-360")
                .setCount(1)
                .setTime(LocalDateTime.now())
                .setCustomerId(28);
    }
}

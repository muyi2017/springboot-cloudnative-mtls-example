/*
 * OrderService.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 5:54 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.service;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.OrderWithCustomerEntity;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.repository.IOrderRepository;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.util.client.ICustomerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService
{
    private static Logger _logger  = LoggerFactory.getLogger(OrderService.class);

    private final IOrderRepository _orderRepository;
    private final ICustomerClient  _customerService;

    public OrderService(IOrderRepository orderRepository, ICustomerClient customerService)
    {
        _orderRepository = orderRepository;
        _customerService = customerService;
    }

    @Override
    public OrderWithCustomerEntity getOrderInfo(int id)
    {
        /* NOTE: Calling repo */
        var entity = new OrderWithCustomerEntity();
        entity.setOrderEntity(_orderRepository.findById(id));
        entity.setCustomerDTO(_customerService.getCustomerInfo(entity.getOrderEntity().getCustomerId()));

        _logger.debug("entity: " + entity);
        System.out.println("entity: " + entity);
        return entity;
    }
}

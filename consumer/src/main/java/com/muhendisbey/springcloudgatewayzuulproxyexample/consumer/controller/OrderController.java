/*
 * OrderController.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 5:46 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.controller;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.converter.IModelConverter;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto.OrderWithCustomerDTO;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController
{
    private final IOrderService _orderService;
    private final IModelConverter _converter;

    public OrderController(IOrderService orderService, IModelConverter converter)
    {
        _orderService   = orderService;
        _converter      = converter;
    }

    @GetMapping("/info")
    OrderWithCustomerDTO getOrderInfo(@RequestParam int id)
    {
        return _converter.toDto(_orderService.getOrderInfo(id));
    }
}

/*
 * CustomerController.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 3:01 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.controller;

import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.converter.IModelConverter;
import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.dto.CustomerDTO;
import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.service.ICustomerService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Customer Service")
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController
{
    private final ICustomerService _customerService;
    private final IModelConverter _modelConverter;

    public CustomerController(ICustomerService customerService, IModelConverter modelConverter)
    {
        _customerService = customerService;
        _modelConverter  = modelConverter;
    }

    @GetMapping("/info")
    CustomerDTO getCustomerInfo(@RequestParam int id)
    {
        return _modelConverter.toDto(_customerService.getCustomerInfo(id));
    }

    /*TODO:
    *  imagine that: there may be create/edit service or some thing like that
    * */
}

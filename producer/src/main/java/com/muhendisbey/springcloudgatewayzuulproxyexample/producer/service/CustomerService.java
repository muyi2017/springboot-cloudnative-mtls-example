/*
 * CustomerService.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 3:07 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.service;

import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.model.CustomerEntity;
import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.repository.ICustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService
{
    private final ICustomerRepo _customerRepo;

    public CustomerService(ICustomerRepo customerRepo)
    {
        _customerRepo = customerRepo;
    }

    @Override
    public CustomerEntity getCustomerInfo(int id)
    {
        return _customerRepo.findById(id);
    }
}

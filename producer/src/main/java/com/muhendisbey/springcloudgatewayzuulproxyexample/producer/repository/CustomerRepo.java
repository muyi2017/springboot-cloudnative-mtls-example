/*
 * CustomerRepo.java
 Author: Onur GURSOY (onur.gursoy@siemens.com)
 Created: 10/1/21 3:21 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.repository;

import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.model.CustomerEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepo implements ICustomerRepo
{
    @Override
    public CustomerEntity findById(long id)
    {
        return new CustomerEntity()
                .setId(id)
                .setName("Onur")
                .setSurname("GURSOY")
                .setEmail("onurgursoy_" + id + "@gmail.com");
    }
}

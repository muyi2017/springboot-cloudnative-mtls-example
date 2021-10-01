/*
 * CustomerRepo.java
 Author: Onur GURSOY (onur.gursoy@siemens.com)
 Created: 10/1/21 3:15 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.repository;

import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.model.CustomerEntity;

/*
* imagine that: you can extend this repo from extends PagingAndSortingRepository<CustomerEntity, Long>
currently we get data as a mock for PoC
*/
public interface ICustomerRepo
{
    CustomerEntity findById(long id);
}

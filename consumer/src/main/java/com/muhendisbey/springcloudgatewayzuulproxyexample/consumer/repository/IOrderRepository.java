/*
 * IOrderRepository.java
 Author: Onur GURSOY (onur.gursoy@siemens.com)
 Created: 10/1/21 5:55 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.repository;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.OrderEntity;

/*
* imagine that: you can extend this repo from extends PagingAndSortingRepository<CustomerEntity, Long>
currently we get data as a mock for PoC
*/
public interface IOrderRepository
{
    OrderEntity findById(int id);
}

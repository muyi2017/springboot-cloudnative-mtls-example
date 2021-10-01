/*
 * IOrderService.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 6:13 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.service;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.OrderWithCustomerEntity;

public interface IOrderService
{
    OrderWithCustomerEntity getOrderInfo(int id);
}

/*
 * ICustomerService.java
 Author: Onur GURSOY (onur.gursoy@siemens.com)
 Created: 10/1/21 3:07 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.service;

import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.model.CustomerEntity;

public interface ICustomerService
{
    CustomerEntity getCustomerInfo(int id);
}

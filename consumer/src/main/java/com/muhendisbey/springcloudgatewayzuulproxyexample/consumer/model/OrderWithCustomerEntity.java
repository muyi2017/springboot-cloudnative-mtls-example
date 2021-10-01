/*
 * OrderWithCustomerEntity.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 6:00 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto.CustomerDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class OrderWithCustomerEntity
{
    OrderEntity orderEntity;
    CustomerDTO customerDTO; /* NOTE: Think again this approach */
}

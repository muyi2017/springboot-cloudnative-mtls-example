/*
 * OrderEntity.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 5:56 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class OrderEntity
{
    private long id;
    private String name;
    private int count;
    private LocalDateTime time;
    private int customerId;
}

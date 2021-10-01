/*
 * OrderDTO.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 5:56 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDTO
{
    private String name;
    private int count;
    private LocalDateTime time;
}

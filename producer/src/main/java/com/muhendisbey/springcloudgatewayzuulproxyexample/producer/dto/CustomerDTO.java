/*
 * CustomerDTO.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 3:01 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.dto;

import lombok.Data;

@Data
public class CustomerDTO
{
    private String name;
    private String surname;
    private String email;
    private String mobile;
    /* There can be some statistics model such as lastlogin attempt, previous orders and so on.
    and this service can pull that information from another service.
     */
}

/*
 * CustomerClient.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 6:03 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.util.client;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("producer")
public interface ICustomerClient
{
    @GetMapping("/api/v1/customer/info")
    public CustomerDTO getCustomerInfo(@RequestParam int id);
}

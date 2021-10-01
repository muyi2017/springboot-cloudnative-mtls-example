/*
 * IModelConverter.java
 Author: Onur GURSOY (onurgursoygyte@gmail.com)
 Created: 10/1/21 6:14 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.converter;

import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto.CustomerDTO;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto.OrderDTO;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.dto.OrderWithCustomerDTO;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.CustomerEntity;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.OrderEntity;
import com.muhendisbey.springcloudgatewayzuulproxyexample.consumer.model.OrderWithCustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "ModelConverter", componentModel = "spring")
public interface IModelConverter
{
    CustomerDTO toDto(CustomerEntity entity);
    OrderDTO toDto(OrderEntity entity);
    @Mapping(source = "orderEntity", target = "orderDTO")
    OrderWithCustomerDTO toDto(OrderWithCustomerEntity entity);

    CustomerEntity toEntity(CustomerDTO dto);
    OrderEntity toEntity(OrderEntity entity);
    @Mapping(source = "orderDTO", target = "orderEntity")
    OrderWithCustomerEntity toEntity(OrderWithCustomerDTO dto);
}

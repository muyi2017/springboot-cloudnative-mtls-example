/*
 * IModelConverter.java
 Author: Onur GURSOY (onur.gursoy@siemens.com)
 Created: 10/1/21 3:56 PM
 Copyright (c) - Siemens AG 2021 - 2024. All rights reserved.
*/
package com.muhendisbey.springcloudgatewayzuulproxyexample.producer.converter;

import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.dto.CustomerDTO;
import com.muhendisbey.springcloudgatewayzuulproxyexample.producer.model.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationName = "ModelConverter")
public interface IModelConverter
{
    CustomerDTO toDto(CustomerEntity entity);
    CustomerEntity toEntity(CustomerDTO dto);
}

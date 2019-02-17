package com.jd.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value="orderService",fallback=FeginOrderError.class)
public interface FeginOrderService {
	
	 @RequestMapping(value = "/getPatients")
     public String getPatients();

}

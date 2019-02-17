package com.jd.api;

import org.springframework.stereotype.Service;

@Service
public class FeginOrderError implements FeginOrderService {

	@Override
	public String getPatients() {
		return "订单系统出错!  sorry ,error !";
	}
}

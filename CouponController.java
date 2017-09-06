package com.epam.mesos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CouponController {
	@Autowired
	private  CouponRepository couponRepository;
	
	@RequestMapping("/getCoupon")
	public Coupon get(){
		Coupon coupon = saveCoupon();
		return couponRepository.findOne(coupon.getId());
	}

	private Coupon saveCoupon() {
		Coupon coupon = new Coupon();
		coupon.setId(UUID.randomUUID().toString());
		coupon.setAuthor("Alice");
		coupon.setCouponDescription("desc");
		return couponRepository.save(coupon);
	}
}

package com.epam.mesos;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

@ViewIndexed(designDoc = "coupon", viewName = "all")
public interface CouponRepository extends CouchbaseRepository<Coupon, String> {

}